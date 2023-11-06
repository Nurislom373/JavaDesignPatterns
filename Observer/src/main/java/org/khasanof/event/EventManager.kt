package org.khasanof.event

class EventManager(vararg operations: String) {

    private val listeners: Map<String, MutableList<EventListener>> = HashMap()

    init {
        operations.forEach {
            listeners.plus(Pair(it, ArrayList()))
        }
    }

    fun subscribe(eventType: String, listener: EventListener) {
        val eventListeners = listeners[eventType]
        eventListeners?.add(listener)
    }

    fun unsubscribe(eventType: String) {
        listeners.minus(eventType)
    }

    fun notify(eventType: String, data: Any) {
        val eventListeners = listeners[eventType]
        eventListeners?.forEach { eventListener ->
            eventListener.update(eventType, data)
        }
    }

}
