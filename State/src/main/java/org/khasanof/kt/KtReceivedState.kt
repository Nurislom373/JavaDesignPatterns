package org.khasanof.kt

class KtReceivedState : KtPackageState {

    override fun next(pkg: KtPackage) {
        println("This package is already received by a client.")
    }

    override fun prev(pkg: KtPackage) {
        pkg.state = KtDeliveredState()
    }

    override fun printStatus() {
        println("End.")
    }

}
