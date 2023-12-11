package org.khasanof.logistic

class RoadLogistics : Logistics() {

    override fun createTransport(): Transport {
        println("create road transport. ")
        return TruckTransport()
    }

}
