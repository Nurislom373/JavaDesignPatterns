package org.khasanof.event

class InfoLogListener(
    private val log: String
) : EventListener {

    override fun update(eventType: String, eventData: Any) {
        println("Save to log $log: Someone has performed $eventType operation with the following data: $eventData")
    }

}
