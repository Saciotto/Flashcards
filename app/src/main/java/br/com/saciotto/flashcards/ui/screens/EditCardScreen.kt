package br.com.saciotto.flashcards.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.saciotto.flashcards.model.Flashcard
import br.com.saciotto.flashcards.sampledata.sampleFlashcards
import br.com.saciotto.flashcards.ui.theme.FlashcardsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditCardScreen (
    flashcard: Flashcard
) {
    var frontText by remember { mutableStateOf(flashcard.front.text) }
    var frontDescription by remember { mutableStateOf(flashcard.front.description) }
    var backText by remember { mutableStateOf(flashcard.back.text) }
    var backDescription by remember { mutableStateOf(flashcard.back.description) }

    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Flashcard")
                },
                navigationIcon = {
                    IconButton(
                        onClick = { /* TODO */ }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close without save changes"
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = { /* TODO */ }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            contentDescription = "Delete this card"
                        )
                    }
                    IconButton(
                        onClick = { /* TODO */ }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = "Save this card"
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        }
    ) { innerPadding ->

        Column (
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            TextField(
                value = frontText,
                onValueChange = { frontText = it },
                label = { Text("Front text") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = frontDescription,
                onValueChange = { frontDescription = it },
                label = { Text("Front description") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = backText,
                onValueChange = { backText = it },
                label = { Text("Back text") },
                modifier = Modifier.fillMaxWidth()
            )

            TextField(
                value = backDescription,
                onValueChange = { backDescription = it },
                label = { Text("Back description") },
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun EditCardScreenPreview() {
    FlashcardsTheme {
        EditCardScreen(sampleFlashcards.first())
    }
}