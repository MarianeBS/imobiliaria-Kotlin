package com.example.appmobiliaria.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appmobiliaria.R
import com.example.appmobiliaria.components.BackButton
import com.example.appmobiliaria.components.ImgCard
import com.example.appmobiliaria.components.ImgCardCorretor
import com.example.appmobiliaria.components.NavContent
import com.example.appmobiliaria.components.NavSecond
import com.example.appmobiliaria.ui.theme.DarkGreen
import com.example.appmobiliaria.ui.theme.Red
import com.example.appmobiliaria.ui.theme.RedDark

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SobreScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    NavSecond()
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = RedDark
                ),
                navigationIcon = {
                    BackButton(){
                        navController.navigate("home")
                    }
                }
            )
        }
    ){
        ContentSobreScreen(navController)
    }
}

@Composable
fun ContentSobreScreen(navController: NavController){
    Column ()
    {
        Row(
            modifier = Modifier.fillMaxSize()
                .padding(top = 80.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            ImgCardCorretor(
                "Corretor Marcos",
                painterResource(R.drawable.marcos_antonio)
            )

            ImgCardCorretor(
                "Corretora Mari",
                painterResource(R.drawable.mariane_souza)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SobrePreview(){
    val navController = rememberNavController()
    SobreScreen(navController)
}