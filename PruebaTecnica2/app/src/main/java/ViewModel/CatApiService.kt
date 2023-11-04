package ViewModel
import Model.CatBreed
import retrofit2.http.GET
import retrofit2.Call


interface CatApiService {

    @GET("breeds")
    fun getCatBreeds(): Call<List<CatBreed>>


}