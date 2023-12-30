package org.khasanof


/**
 * @see org.khasanof
 * @author Nurislom
 * @since 12/30/2023 9:52 PM
 */
class Switch(

    private var upCommand: Command,
    private var downCommand: Command

) {

    fun flipUp() {
        upCommand.execute()
    }

    fun flipDown() {
        downCommand.execute()
    }

}