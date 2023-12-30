package org.khasanof.commands

import org.khasanof.Command
import org.khasanof.Light


/**
 * @see org.khasanof
 * @author Nurislom
 * @since 12/30/2023 9:54 PM
 */
class LightOnCommand(private val light: Light) : Command {

    override fun execute() {
        light.turnOn()
    }

}