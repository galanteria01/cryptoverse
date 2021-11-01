package com.shanu.cryptoverse.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.surface
    ) {
        Column (
            modifier = Modifier.padding(12.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
            Text(
                "Hello There!",
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold
            )
            Card (modifier = Modifier
                .fillMaxWidth()
                .height(88.dp)){
                Column (modifier = Modifier.padding(12.dp).fillMaxWidth()){
                    Row {
                        Text(
                            "$300 B",
                            color = MaterialTheme.colors.primaryVariant,
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Row(
                        horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            "Market Cap",
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
            Row() {

            }

        }
    }
}