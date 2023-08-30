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
import androidx.compose.ui.res.stringResource
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
            title= stringResource(R.string.tutorial_jetpack_compose),
            pequeniaDescripcion= stringResource(R.string.jetpack_compose_es_un_conjunto_de_herramientas_moderno_para_crear_una_interfaz_de_usuario_nativa_de_android_compose_simplifica_y_acelera_el_desarrollo_de_la_interfaz_de_usuario_en_android_con_menos_c_digo_herramientas_potentes_y_api_de_kotlin_intuitivas),
            largaDescripcion= stringResource(R.string.en_este_tutorial_crear_un_componente_de_interfaz_de_usuario_simple_con_funciones_declarativas_llamas_a_las_funciones_de_compose_para_decir_qu_elementos_quieres_y_el_compilador_de_compose_hace_el_resto_compose_se_basa_en_funciones_componibles_estas_funciones_le_permiten_definir_la_interfaz_de_usuario_de_su_aplicaci_n_mediante_programaci_n_porque_le_permiten_describir_c_mo_deber_a_verse_y_proporcionar_dependencias_de_datos_en_lugar_de_centrarse_en_el_proceso_de_construcci_n_de_la_interfaz_de_usuario_como_inicializar_un_elemento_y_luego_adjuntarlo_a_un_padre_para_crear_una_funci_n_composable_agrega_la_anotaci_n_composable_al_nombre_de_la_funci_n),
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