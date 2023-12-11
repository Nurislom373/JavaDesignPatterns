package org.khasanof.logistic

abstract class Logistics() {

    fun planDelivery() {
        val transport = createTransport()
        transport.deliver()
    }

    abstract fun createTransport(): Transport;

}
