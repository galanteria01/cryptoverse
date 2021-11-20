package com.shanu.cryptoverse.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import me.onebone.toolbar.CollapsingToolbarScaffold
import me.onebone.toolbar.ScrollStrategy
import me.onebone.toolbar.rememberCollapsingToolbarScaffoldState

@ExperimentalCoilApi
@Composable
fun CryptoScreen() {
    val state = rememberCollapsingToolbarScaffoldState()
    CollapsingToolbarScaffold(
        state = state,
        scrollStrategy = ScrollStrategy.EnterAlways,
        modifier=Modifier,
        toolbar = {
            val textSize = (18 + (30 - 18) * state.toolbarState.progress).sp

            Box(
                modifier = Modifier
                    .background(MaterialTheme.colors.primary)
                    .fillMaxWidth()
                    .height(150.dp)
                    .pin()
            )

            Text(
                text = "Crypto List",
                modifier = Modifier
                    .road(Alignment.CenterStart, Alignment.BottomEnd)
                    .padding(60.dp, 16.dp, 16.dp, 16.dp),
                color = Color.White,
                fontSize = textSize
            )

        }
    ) {
        Surface() {
            LazyColumn(modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()){
                items(100) {
                    CryptoListItem(
                        image = "https://cdn2.vectorstock.com/i/1000x1000/02/21/bitcoin-icon-vector-23190221.jpg" ,
                        name = "Bitcoin",
                        id = it.toString(),
                        symbol = "BTC"
                    )
                }
            }
        }

    }
}

@ExperimentalCoilApi
@Composable
fun CryptoListItem(image:String, name:String, id:String, symbol:String) {
    Card (
        modifier = Modifier.fillMaxWidth().padding(8.dp)
            ){
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = rememberImagePainter(image),
                    contentDescription = null,
                    modifier = Modifier.size(32.dp).padding(4.dp)
                )
                Text(
                    name,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
            Text(
                symbol,
                fontWeight = FontWeight.Bold,

            )
        }
    }
}