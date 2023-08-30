package com.example.a19200211_20200077_articulo_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import com.example.a19200211_20200077_articulo_compose.ui.theme._19200211_20200077_articulo_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _19200211_20200077_articulo_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
    fun ComposeArticleApp(){
        ArticleCard(
            title="Tutorial Jetpack Compose",
            pequeniaDescripcion="Jetpack Compose es un conjunto de herramientas moderno para crear una interfaz de usuario nativa de Android. Compose simplifica y acelera el desarrollo de la interfaz de usuario en Android con menos código, herramientas potentes y API de Kotlin intuitivas",
            largaDescripcion="En este tutorial, creará un componente de interfaz de usuario simple con funciones declarativas. Llamas a las funciones de Compose para decir qué elementos quieres y el compilador de Compose hace el resto. Compose se basa en funciones componibles. Estas funciones le permiten definir la interfaz de usuario de su aplicación mediante programación porque le permiten describir cómo debería verse y proporcionar dependencias de datos, en lugar de centrarse en el proceso de construcción de la interfaz de usuario, como inicializar un elemento y luego adjuntarlo a un padre. Para crear una función Composable, agrega la anotación @Composable al nombre de la función.",
            imagePainter = painterResource(R.drawable.bg_compose_background)
            )
    }

@Composable
    private fun ArticleCard(
    title:String,
    pequeniaDescripcion:String,
    largaDescripcion:String,
    modifier:Modifier=Modifier,
    imagePainter: Painter,
    ){
        Column(modifier=modifier){
            Image(painter = imagePainter, contentDescription = null)
            Text(
                text=title,
                modifier=Modifier.padding(16.dp),
                fontSize=24.sp
            )
            Text(
                text = pequeniaDescripcion,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Justify
            )
            Text(
                text = largaDescripcion,
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Justify
            )
        }
    }
@Preview(showBackground = true)
@Composable
fun ComposeArticleAppPreview() {
    _19200211_20200077_articulo_composeTheme {
        ComposeArticleApp()
    }
}