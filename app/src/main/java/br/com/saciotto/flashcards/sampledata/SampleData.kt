package br.com.saciotto.flashcards.sampledata

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import br.com.saciotto.flashcards.model.FlashcardFace
import br.com.saciotto.flashcards.model.Flashcard

val sampleFlashcards = listOf(
    Flashcard(
        id = 1,
        front = FlashcardFace(text = "Home", description = "Place where someone lives"),
        back = FlashcardFace(text = "Casa", description = "Lugar onde alguém vive"),
    ),
    Flashcard(
        id = 2,
        front = FlashcardFace(text = "Ball", description = "Used in some games"),
        back = FlashcardFace(text = "Bola", description = "Usada em alguns jogos"),
    ),
    Flashcard(
        id = 3,
        front = FlashcardFace(text = "Ice cream", description = "Dessert"),
        back = FlashcardFace(text = "Sorvete", description = "Sobremesa"),
    ),
    Flashcard(
        id = 4,
        front = FlashcardFace(text = "Keyboard"),
        back = FlashcardFace(text = "Teclado"),
    ),
    Flashcard(
        id = 5,
        front = FlashcardFace(text = "Very large word or expression"),
        back = FlashcardFace(text = "Palavra ou expressão muito grande"),
    ),
    Flashcard(
        id = 6,
        front = FlashcardFace(text = "Example", description = LoremIpsum(100).values.first()),
        back = FlashcardFace(text = "Exemplo", description = LoremIpsum(100).values.first())
    ),
    Flashcard(
        id = 7,
        front = FlashcardFace(
            text = LoremIpsum(100).values.first(),
            description = LoremIpsum(100).values.first()
        ),
        back = FlashcardFace(
            text = LoremIpsum(100).values.first(),
            description = LoremIpsum(100).values.first()
        )
    ),

    ////

    Flashcard(
        id = 1,
        front = FlashcardFace(text = "Home", description = "Place where someone lives"),
        back = FlashcardFace(text = "Casa", description = "Lugar onde alguém vive"),
    ),
    Flashcard(
        id = 2,
        front = FlashcardFace(text = "Ball", description = "Used in some games"),
        back = FlashcardFace(text = "Bola", description = "Usada em alguns jogos"),
    ),
    Flashcard(
        id = 3,
        front = FlashcardFace(text = "Ice cream", description = "Dessert"),
        back = FlashcardFace(text = "Sorvete", description = "Sobremesa"),
    ),
    Flashcard(
        id = 4,
        front = FlashcardFace(text = "Keyboard"),
        back = FlashcardFace(text = "Teclado"),
    ),
    Flashcard(
        id = 5,
        front = FlashcardFace(text = "Very large word or expression"),
        back = FlashcardFace(text = "Palavra ou expressão muito grande"),
    ),
    Flashcard(
        id = 6,
        front = FlashcardFace(text = "Example", description = LoremIpsum(100).values.first()),
        back = FlashcardFace(text = "Exemplo", description = LoremIpsum(100).values.first())
    ),
    Flashcard(
        id = 7,
        front = FlashcardFace(
            text = LoremIpsum(100).values.first(),
            description = LoremIpsum(100).values.first()
        ),
        back = FlashcardFace(
            text = LoremIpsum(100).values.first(),
            description = LoremIpsum(100).values.first()
        )
    )

)
