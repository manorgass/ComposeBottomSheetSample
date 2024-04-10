package com.manorgass.composebottomsheet

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomSheetContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            text = "Welcome to the bottom sheet!",
            textAlign = TextAlign.Center,
            fontSize = 26.sp
        )

        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "This is test bottom sheet. You can add any content here. This is test bottom sheet. You can add any content here. This is test bottom sheet. You can add any content here."
        )
    }
}

@Preview
@Composable
fun BottomSheetContentPreview() {
    BottomSheetContent()
}