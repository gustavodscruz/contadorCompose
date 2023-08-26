package com.example.myapp.telas

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskScreen(){

    val vlrDoTextField = remember {
        mutableStateOf("Escreva!")
    }
    val contador = remember {
        mutableStateOf(0)
    }

    Column(modifier = Modifier.padding(20.dp)) {
        Text(text = "Título da Tarefa")
        TextField(value = vlrDoTextField.value, 
            onValueChange = { 
                vlrDoTextField.value = it
                Log.i("### fun TaskScreen(){", it)
            }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = vlrDoTextField.value)

        Button(onClick = {
            //contador.value = contador.value + 1
            contador.value ++
        }) {
            Text(text = "Contar!")
        }

        Text(text = contador.value.toString())
    }
}