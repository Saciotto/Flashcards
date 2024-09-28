package br.com.saciotto.flashcards.model

data class Flashcard (
    val id: Int,
    val front: FlashcardFace,
    val back: FlashcardFace
)
