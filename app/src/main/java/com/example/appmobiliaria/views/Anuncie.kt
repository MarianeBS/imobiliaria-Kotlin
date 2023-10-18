package com.example.appmobiliaria.views

import android.annotation.SuppressLint
import android.widget.EditText
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.appmobiliaria.R
import com.example.appmobiliaria.components.NavContent
import com.example.appmobiliaria.ui.theme.RedDark

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.sharp.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.appmobiliaria.components.BackButton
import com.example.appmobiliaria.components.LittleRedButton
import com.example.appmobiliaria.components.NavSecond
import com.example.appmobiliaria.components.RedButton

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AnuncieScreen(navController: NavController){
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
        ContentAnuncieScreen(navController)
    }
}

@Composable
fun ContentAnuncieScreen(navController: NavController){
    Column (modifier = Modifier
            .background(White)
            .padding(start = 20.dp, top = 50.dp, end = 30.dp, bottom = 0.dp)
            .verticalScroll(rememberScrollState())
            .fillMaxSize()
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ){
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Logo",
                Modifier.width(400.dp)
            )
            Spacer(Modifier.height(15.dp))
        }

        Row (){
            Column(){
                Text(
                    text = "Cadastre seu imóvel",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    "Envie-nos seus contatos e os dados do imóvel para anunciar no app"
                )

                Spacer(Modifier.height(20.dp))

                //SELECT tipo de imóvel
                SelectDropdown(
                    arrayOf("Casa", "Apartamento", "Chácara", "Comercial"),
                    "Tipo de imóvel"
                )

                //SELECT Disponível para
                SelectDropdown(
                    arrayOf("Locação", "Venda", "Locação e venda"),
                    "Disponível para"
                )

                //SELECT Preço de venda
                MyOutlinedTextField("Preço de venda")

                //SELECT Endereço do imóvel
                MyOutlinedTextField("Endereço do imóvel")

                //SELECT Valor do aluguel
                MyOutlinedTextField("Valor do aluguel")

                Spacer(Modifier.height(20.dp))

                TextButton(
                    onClick = { navController.navigate("home") },
                    modifier = Modifier
                        .width(315.dp)
                        .height(60.dp)
                        .background(
                            Color.Red,
                            shape = RoundedCornerShape(10.dp)
                        )
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween // Espaçamento entre elementos
                    ) {
                        Text(
                            text = "Enviar",
                            color = White,
                            fontSize = 20.sp,
                            modifier = Modifier.weight(1f) // Ocupa todo o espaço disponível
                        )

                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = "Icon",
                            tint = White,
                            modifier = Modifier.size(30.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(15.dp)) // Espaço entre os botões

            }
        }
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SelectDropdown(items: Array<String>, title: String) {
    val context = LocalContext.current
   // val items = arrayOf("Casa", "Apartamento", "Chácara", "Comercial")
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(title) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp)
    ) {
        ExposedDropdownMenuBox(
            expanded = expanded,
            onExpandedChange = {
                expanded = !expanded
            },
        ) {
            OutlinedTextField(
                value = selectedText,
                onValueChange = {},
                readOnly = true,
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
                modifier = Modifier
                    .menuAnchor()
                    .fillMaxWidth(),

                colors = TextFieldDefaults.outlinedTextFieldColors(
                    focusedBorderColor = Red, // Cor da borda quando o campo está focado
                    unfocusedBorderColor = Gray, // Cor da borda quando o campo não está focado
                    cursorColor = Color.Black // Cor do cursor
                ),

            )

            ExposedDropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier.background(Color.White) // E aqui
            ) {
                items.forEach { item ->
                    DropdownMenuItem(
                        text = { Text(text = item, color = Black) },
                        onClick = {
                            selectedText = item
                            expanded = false
                            //Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                        }
                    )
                }
            }
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyOutlinedTextField(label: String) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text(label) },
        modifier = Modifier.fillMaxWidth(),

        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Red, // Cor da borda quando o campo está focado
            unfocusedBorderColor = Gray, // Cor da borda quando o campo não está focado
            cursorColor = Color.Black // Cor do cursor
        ),

    )
}

@Preview(showBackground = true)
@Composable
fun AnunciePreview(){
    val navController = rememberNavController()
    AnuncieScreen(navController)
}