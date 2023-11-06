package org.khasanof.event

class EmailNotificationListener(
    private val email: String
) : EventListener {

    @Override
    override fun update(eventType: String, eventData: Any) {
        println("Email to $email: Someone has performed $eventType operation with the following data: $eventData")
    }

}
