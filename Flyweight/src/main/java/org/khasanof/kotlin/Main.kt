package org.khasanof.kotlin

fun main() {

    val factory = CharacterFactory()

    val character1 = factory.getCharacter('A')
    character1?.display("Ariel")

    val character2 = factory.getCharacter('B')
    character2?.display("Times New Roman")

    val character3 = factory.getCharacter('A')
    character3?.display("Calibri")

    println("total create object count : ${factory.totalObjectsCount()}")

}
