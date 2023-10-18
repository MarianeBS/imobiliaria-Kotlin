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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appmobiliaria.R
import com.example.appmobiliaria.components.NavContent
import com.example.appmobiliaria.components.RedButton
import com.example.appmobiliaria.ui.theme.RedDark
import com.example.appmobiliaria.ui.theme.Red

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    NavContent()
                },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = RedDark
                ),
                navigationIcon = {
                    Icons.Default.List
                }
            )
        }
    ){
        ContenHomeScreen(navController)
    }
}

@Composable
fun ContenHomeScreen(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Red)
        .padding(top = 80.dp)
        .verticalScroll(rememberScrollState()),

        //.align(CenterHorizontally),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TextButton(
            onClick = { navController.navigate("comprar") },
            modifier = Modifier
                .border(1.dp, Color.White, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = Red, // Cor de fundo do botão
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Espaçamento entre elementos
            ) {
                Text(
                    text = "Comprar",
                    color = Color.White,
                    fontSize = 30.sp,
                    modifier = Modifier.weight(1f) // Ocupa todo o espaço disponível
                )

                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "Icon",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp)) // Espaço entre os botões


        TextButton(
            onClick = { navController.navigate("comprar") },
            modifier = Modifier
                .border(1.dp, Color.White, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = Red, // Cor de fundo do botão
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Espaçamento entre elementos
            ) {
                Text(
                    text = "Alugar",
                    color = Color.White,
                    fontSize = 30.sp,
                    modifier = Modifier.weight(1f) // Ocupa todo o espaço disponível
                )

                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Icon",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp)) // Espaço entre os botões


        TextButton(
            onClick = { navController.navigate("novo") },
            modifier = Modifier
                .border(1.dp, Color.White, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = Red, // Cor de fundo do botão
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Espaçamento entre elementos
            ) {
                Text(
                    text = "Novos",
                    color = Color.White,
                    fontSize = 30.sp,
                    modifier = Modifier.weight(1f) // Ocupa todo o espaço disponível
                )

                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = "Icon",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp)) // Espaço entre os botões

        TextButton(
            onClick = { navController.navigate("Anuncie") },
            modifier = Modifier
                .border(1.dp, Color.White, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = Red, // Cor de fundo do botão
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Espaçamento entre elementos
            ) {
                Text(
                    text = "Anuncie no App",
                    color = Color.White,
                    fontSize = 30.sp,
                    modifier = Modifier.weight(1f) // Ocupa todo o espaço disponível
                )

                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = "Icon",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp)) // Espaço entre os botões

        TextButton(
            onClick = { navController.navigate("sobre") },
            modifier = Modifier
                .border(1.dp, Color.White, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = Red, // Cor de fundo do botão
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Espaçamento entre elementos
            ) {
                Text(
                    text = "Nosso Time",
                    color = Color.White,
                    fontSize = 30.sp,
                    modifier = Modifier.weight(1f) // Ocupa todo o espaço disponível
                )

                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = "Icon",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp)) // Espaço entre os botões

        TextButton(
            onClick = { navController.navigate("sobre") },
            modifier = Modifier
                .border(1.dp, Color.White, MaterialTheme.shapes.extraSmall)
                .width(315.dp)
                .height(80.dp)
                .background(
                    color = Red, // Cor de fundo do botão
                )
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Espaçamento entre elementos
            ) {
                Text(
                    text = "Sobre Nós",
                    color = Color.White,
                    fontSize = 30.sp,
                    modifier = Modifier.weight(1f) // Ocupa todo o espaço disponível
                )

                Icon(
                    imageVector = Icons.Default.Face,
                    contentDescription = "Icon",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp)) // Espaço entre os botões
    }
}

@Preview(showBackground = true)
@Composable
fun Home(){
    val navController = rememberNavController()
    HomeScreen(navController)
}