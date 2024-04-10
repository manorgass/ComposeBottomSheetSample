package com.manorgass.composebottomsheet

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalBottomSheetScreen() {
    var isShowBottomSheet by remember { mutableStateOf(false) }

    if (isShowBottomSheet) {
        ModalBottomSheet(
            onDismissRequest = { isShowBottomSheet = false }
        ) {
            BottomSheetContent()
        }
    }

    MainContent {
        isShowBottomSheet = !isShowBottomSheet
    }
}

