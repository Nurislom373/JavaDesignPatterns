package org.khasanof.commands

import org.khasanof.Command
import org.khasanof.Light


/**
 * @see org.khasanof.commands
 * @author Nurislom
 * @since 12/30/2023 9:55 PM
 */
class LightOffCommand(private val light: Light) : Command {

    override fun execute() {
        light.turnOff()
    }

}