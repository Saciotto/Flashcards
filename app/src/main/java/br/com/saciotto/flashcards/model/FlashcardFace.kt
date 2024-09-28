package br.com.saciotto.flashcards.model

data class FlashcardFace (
    val text: String,
    val description: String = "",
    val imageURL: String = ""
)
