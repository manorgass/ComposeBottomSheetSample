package com.manorgass.composebottomsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SheetValue
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberStandardBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetScaffoldScreen() {

    val state = rememberBottomSheetScaffoldState(
        bottomSheetState = rememberStandardBottomSheetState(
            initialValue = SheetValue.Hidden,
            skipHiddenState = false
        )
    )
    val scope = rememberCoroutineScope()

    BottomSheetScaffold(
        scaffoldState = state,
        sheetContent = { BottomSheetContent() },
        // if set below setting, skip PartialExpand State.
        //sheetPeekHeight = 0.dp
    ) {
        Box {
            Column(
                modifier = Modifier.align(Alignment.Center),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(text = "Current State is ${state.bottomSheetState.currentValue}")
                Button(
                    onClick = {
                        scope.launch {
                            state.bottomSheetState.show()
                        }
                    }
                ) {
                    Text(text = "Show Bottom Sheet")
                }

                Button(
                    onClick = {
                        scope.launch {
                            state.bottomSheetState.hide()
                        }
                    }
                ) {
                    Text(text = "Hide Bottom Sheet")
                }

                Button(
                    onClick = {
                        scope.launch {
                            state.bottomSheetState.expand()
                        }
                    }
                ) {
                    Text(text = "Expand Bottom Sheet")
                }

                Button(
                    onClick = {
                        scope.launch {
                            state.bottomSheetState.partialExpand()
                        }
                    }
                ) {
                    Text(text = "PartialExpand Bottom Sheet")
                }
            }
        }
    }
}
