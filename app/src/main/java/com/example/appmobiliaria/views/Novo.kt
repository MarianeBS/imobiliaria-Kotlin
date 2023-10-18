package com.example.appmobiliaria.views

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appmobiliaria.components.BackButton
import com.example.appmobiliaria.components.NavContent
import com.example.appmobiliaria.components.NavSecond
import com.example.appmobiliaria.components.RedButton
import com.example.appmobiliaria.components.WhiteButton
import com.example.appmobiliaria.ui.theme.Red
import com.example.appmobiliaria.ui.theme.RedDark

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NovoScreen(navController: NavController){
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
        NovoComprarScreen(navController)
    }
}

@Composable
fun NovoComprarScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Red)
        .padding(top = 80.dp),
        //.align(CenterHorizontally),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextButton(
            onClick = { navController.navigate("comprar") },
            modifier = Modifier
                .width(315.dp)
                .height(80.dp)
                .background(
                    Color.White,
                    shape = RoundedCornerShape(50.dp)
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Espaçamento entre elementos
            ) {
                Text(
                    text = "Casas",
                    color = Color.Red,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(1f) // Ocupa todo o espaço disponível
                )

                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Icon",
                    tint = Color.Red,
                    modifier = Modifier.size(30.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp)) // Espaço entre os botões

        TextButton(
            onClick = { navController.navigate("comprar") },
            modifier = Modifier
                .width(315.dp)
                .height(80.dp)
                .background(
                    Color.White,
                    shape = RoundedCornerShape(50.dp)
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Espaçamento entre elementos
            ) {
                Text(
                    text = "Apartamentos",
                    color = Color.Red,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(1f) // Ocupa todo o espaço disponível
                )

                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Icon",
                    tint = Color.Red,
                    modifier = Modifier.size(30.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp)) // Espaço entre os botões

        TextButton(
            onClick = { navController.navigate("comprar") },
            modifier = Modifier
                .width(315.dp)
                .height(80.dp)
                .background(
                    Color.White,
                    shape = RoundedCornerShape(50.dp)
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Espaçamento entre elementos
            ) {
                Text(
                    text = "Chácaras",
                    color = Color.Red,
                    fontSize = 20.sp,
                    modifier = Modifier.weight(1f) // Ocupa todo o espaço disponível
                )

                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Icon",
                    tint = Color.Red,
                    modifier = Modifier.size(30.dp)
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun NovoPreview(){
    val navController = rememberNavController()
    NovoScreen(navController)
}