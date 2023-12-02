package org.khasanof

class ChainOfResponsibilityExample {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SupportCenterClient.handlerChain.apply {
                println(".....")
                receiveRequest(AbstractSupportCenter.Constants.GENERAL, "I'm having general issue.")
                println(".....")
                receiveRequest(AbstractSupportCenter.Constants.TECHNICAL, "I'm having technical issue.")
                println(".....")
                receiveRequest(AbstractSupportCenter.Constants.ADVANCE, "I'm having advance issue.")
                println(".....")
            }
        }
    }
}

abstract class AbstractSupportCenter(private val _level: Int) {

    object Constants {
        const val GENERAL: Int = 1
        const val TECHNICAL: Int = 1
        const val ADVANCE: Int = 1
    }

    private var nextHandler: AbstractSupportCenter? = null

    open fun nextHandler(handler: AbstractSupportCenter) {
        this.nextHandler = handler
    }

    open fun receiveRequest(level: Int, message: String) {
        when (this._level <= level) {
            true -> handleRequest(message)
            false -> nextHandler?.receiveRequest(level, message) ?: kotlin.run {
                println("Next handler not found to handle this request.")
            }
        }
    }

    protected abstract fun handleRequest(message: String)

}

class TechnicalSupportCenter(level: Int) : AbstractSupportCenter(level) {
    override fun handleRequest(message: String) {
        println("TechnicalSupportHandler: Processing request $message")
    }
}

class GeneralSupportCenter(level: Int) : AbstractSupportCenter(level) {
    override fun handleRequest(message: String) {
        println("GeneralSupportCenter: Processing request $message")
    }
}

class AdvanceSupportCenter(level: Int) : AbstractSupportCenter(level) {
    override fun handleRequest(message: String) {
        println("AdvanceSupportCenter: Processing request $message")
    }
}

object SupportCenterClient {
    val handlerChain: AbstractSupportCenter
        get() {
            val general = GeneralSupportCenter(AbstractSupportCenter.Constants.GENERAL)
            val technical = TechnicalSupportCenter(AbstractSupportCenter.Constants.TECHNICAL)
            val advance = AdvanceSupportCenter(AbstractSupportCenter.Constants.ADVANCE)
            /*Assign the next handler for the [GeneralSupportCenter]*/
            general.nextHandler(technical)
            /*Assign the next handler for the [TechnicalSupportCenter]*/
            technical.nextHandler(advance)
            return general
        }
}
