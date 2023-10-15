package org.khasanof.kotlin

import java.util.Objects

class CharacterFactory {

    private val characterCache: Map<Char, Character> = HashMap()

    fun getCharacter(char: Char): Character? {
        var character = characterCache[char]
        if (Objects.isNull(character)) {
            character = ConcreteCharacter(char)
            characterCache.plus(Pair(char, character))
        }
        return character
    }

    fun totalObjectsCount(): Int {
        return characterCache.size
    }

}

