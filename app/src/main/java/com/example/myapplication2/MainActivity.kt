package com.example.myapplication2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaDePresentacion()
        }
    }
}



@Composable
fun TarjetaDePresentacion() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        color = MaterialTheme.colorScheme.background
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {

            Text(text = "Diego Troncoso", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Icon(Icons.Default.Person , "Persona")
            Text(text = "Programador", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Icon(Icons.Default.Email, "Email")
            Text(text = "d.troncoso@alumnos.santotomas.cl", style = MaterialTheme.typography.bodyMedium)
            Icon(Icons.Default.Call, "Telefono")
            Text(text = "912345678", style = MaterialTheme.typography.bodyMedium)
            ViewLogo(modifier = Modifier.padding(top = 5.dp))


        }
    }
}

@Composable
fun ViewLogo(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.logo)
    Image(
        painter = image,
        contentDescription = "LogoST",
        modifier = modifier
    )
}



@Preview(showBackground = true)
@Composable
fun PreviewTarjetaDePresentacion() {
    TarjetaDePresentacion()
}
