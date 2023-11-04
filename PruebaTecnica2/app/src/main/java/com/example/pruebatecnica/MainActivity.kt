package com.example.pruebatecnica

import Model.CatBreed
import Service.CatService
import ViewModel.CatApiService
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
 
import androidx.compose.material3.Surface
 
import androidx.compose.runtime.remember
 
 
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.glide.rememberGlidePainter
 

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pruebatecnica.ui.theme.PruebaTecnicaTheme

class MainActivity : ComponentActivity() {
    private val viewModel = CatService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PruebaTecnicaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CatSelectorScreen(viewModel)
                }
            }
        }
    }

    class CatSelectorScreen(viewModel: CatService) {

    }


    @Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}


    @Composable//funcion mostrar en patalla los fatos por raza
    fun CatBreedsScreen(catBreeds: List<CatBreed>, selectedBreed: CatBreed?, onBreedSelected: (CatBreed) -> Unit) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Selector de razas de gatos (Spinner)
            DropdownMenu(
                expanded = false,
                onDismissRequest = {  },
            ) {
                catBreeds.forEach { breed ->

                }
            }


            selectedBreed?.let { breed ->

            }
        }
    }



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PruebaTecnicaTheme {
        Greeting("Android")
    }


            
        }
}