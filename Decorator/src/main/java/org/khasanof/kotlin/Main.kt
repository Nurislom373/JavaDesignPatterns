package org.khasanof.kotlin

fun main() {

    val decorator = ScrollComponentDecorator(BorderComponentDecorator(TextComponent()))
    decorator.draw()

}
