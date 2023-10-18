package com.example.appmobiliaria.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.appmobiliaria.ui.theme.RedDark

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun NavContent() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(end = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Menu, // Ícone à esquerda
            contentDescription = "Icon1",
            tint = Color.White,
            modifier = Modifier.size(40.dp)
        )
        Text(
            text = "Imobiliária",
            color = Color.White
        )
        Spacer(modifier = Modifier.weight(1f)) // Espaço flexível para empurrar o ícone para a direita

        Icon(
            imageVector = Icons.Filled.Search, // Ícone à direita
            contentDescription = "Icon2",
            tint = Color.White,
            modifier = Modifier.size(40.dp)
        )
    }
}

@Composable
fun NavSecond() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(end = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Text(
            text = "Imobiliária",
            color = Color.White
        )
        Spacer(modifier = Modifier.weight(1f)) // Espaço flexível para empurrar o ícone para a direita

        Icon(
            imageVector = Icons.Filled.Search, // Ícone à direita
            contentDescription = "Icon2",
            tint = Color.White,
            modifier = Modifier.size(40.dp)
        )
    }
}
