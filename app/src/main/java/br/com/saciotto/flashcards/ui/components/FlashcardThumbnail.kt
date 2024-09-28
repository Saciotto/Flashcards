package br.com.saciotto.flashcards.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.saciotto.flashcards.model.Flashcard
import br.com.saciotto.flashcards.sampledata.sampleFlashcards
import br.com.saciotto.flashcards.ui.theme.FlashcardsTheme

@Composable
fun FlashcardThumbnail(
    flashcard: Flashcard,
    modifier: Modifier = Modifier
) {
    Card(modifier) {
        Column(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = flashcard.front.text,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                fontWeight = FontWeight(700)
            )
            val description = flashcard.front.description
            if (description.isNotBlank()) {
                Text(
                    text = description,
                    modifier = Modifier.fillMaxWidth(),
                    fontWeight = FontWeight(400),
                    textAlign = TextAlign.Center,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}

@Preview
@Composable
private fun FlashcardThumbnailPreview() {
    FlashcardsTheme {
        FlashcardThumbnail(
            flashcard = sampleFlashcards.last(),
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
        )
    }
}