package Service;

import java.util.List;

import Model.CatBreed;
import ViewModel.CatApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CatService {
    private CatApiService catApiService;

    public CatService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.thecatapi.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        catApiService = retrofit.create(CatApiService.class);
    }

    public void getCatBreeds(final OnCatBreedsReceivedListener listener) {
        Call<List<CatBreed>> call = catApiService.getCatBreeds();
        call.enqueue(new Callback<List<CatBreed>>() {
            @Override
            public void onResponse(Call<List<CatBreed>> call, Response<List<CatBreed>> response) {
                if (response.isSuccessful()) {
                    List<CatBreed> catBreeds = response.body();
                    if (catBreeds != null) {
                        listener.onCatBreedsReceived(catBreeds);
                    }
                } else {
                    // Manejar respuesta no exitosa
                }
            }

            @Override
            public void onFailure(Call<List<CatBreed>> call, Throwable t) {
                // Manejar fallo en la comunicación con la API
            }
        });
    }

    public interface OnCatBreedsReceivedListener {
        void onCatBreedsReceived(List<CatBreed> catBreeds);
    }
}
