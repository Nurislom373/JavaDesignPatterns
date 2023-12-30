package org.khasanof

import org.khasanof.commands.LightOffCommand
import org.khasanof.commands.LightOnCommand

/**
 * @see org.khasanof
 * @author Nurislom
 * @since 12/30/2023 9:57 PM
 */

fun main() {

    val light = Light()
    val lightOnCommand = LightOnCommand(light)
    val lightOffCommand = LightOffCommand(light)

    val lightSwitch = Switch(lightOnCommand, lightOffCommand)
    lightSwitch.flipUp()
    lightSwitch.flipDown()

}