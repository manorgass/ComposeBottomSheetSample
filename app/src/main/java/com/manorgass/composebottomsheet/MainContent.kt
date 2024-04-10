package com.manorgass.composebottomsheet

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun MainContent(
    onClickShowBottomSheet: () -> Unit = {}
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(text = "Main Content!", fontSize = 34.sp)

        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = { onClickShowBottomSheet() }
        ) {
            Text(text = "Show Bottom Sheet")
        }
    }
}

@Preview
@Composable
private fun MainContentPreview() {
    MainContent()
}