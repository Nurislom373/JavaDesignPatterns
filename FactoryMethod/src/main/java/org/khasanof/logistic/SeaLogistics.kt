package org.khasanof.logistic

class SeaLogistics : Logistics() {

    override fun createTransport(): Transport {
        println("create sea transport. ")
        return ShipTransport()
    }

}
