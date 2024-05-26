package com.manorgass.composebottomsheet

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalBottomSheetScreen() {
    var isShowBottomSheet by remember { mutableStateOf(false) }

    Box(modifier = Modifier.fillMaxSize()) {
        Button(
            modifier = Modifier.align(Alignment.Center),
            onClick = { isShowBottomSheet = !isShowBottomSheet }
        ) {
            if (isShowBottomSheet) {
                ModalBottomSheet(
                    scrimColor = Color.Cyan.copy(alpha = 0.3f),
                    onDismissRequest = { isShowBottomSheet = !isShowBottomSheet },
                    content = { BottomSheetContent() }
                )
                Text(text = "Hide Bottom Sheet")
            } else {
                Text(text = "Show Bottom Sheet")
            }
        }
    }
}

