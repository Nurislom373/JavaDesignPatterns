package org.khasanof.event

interface EventListener {

    fun update(eventType: String, eventData: Any)

}
