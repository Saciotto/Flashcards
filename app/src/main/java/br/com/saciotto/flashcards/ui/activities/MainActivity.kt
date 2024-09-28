package br.com.saciotto.flashcards.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import br.com.saciotto.flashcards.sampledata.sampleFlashcards
import br.com.saciotto.flashcards.ui.screens.EditDeckScreen
import br.com.saciotto.flashcards.ui.theme.FlashcardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FlashcardsTheme {
                EditDeckScreen(sampleFlashcards)
            }
        }
    }
}
