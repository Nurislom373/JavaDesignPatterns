package org.khasanof.kotlin

class ConcreteCharacter(private val character: Char) : Character {

    override fun display(font: String) {
        println("Character: $character, Font $font")
    }

}
