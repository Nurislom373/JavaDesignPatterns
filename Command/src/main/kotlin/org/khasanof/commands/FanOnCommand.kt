package org.khasanof.commands

import org.khasanof.Command
import org.khasanof.Fan


/**
 * @see org.khasanof.commands
 * @author Nurislom
 * @since 12/30/2023 9:57 PM
 */
class FanOnCommand(private val fan: Fan) : Command {

    override fun execute() {
        fan.startRotate()
    }

}