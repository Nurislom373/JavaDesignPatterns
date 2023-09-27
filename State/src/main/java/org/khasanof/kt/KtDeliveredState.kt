package org.khasanof.kt

import org.khasanof.Package

class KtDeliveredState : KtPackageState {

    override fun next(pkg: KtPackage) {
        pkg.state = KtReceivedState()
    }

    override fun prev(pkg: KtPackage) {
        pkg.state = KtOrderedState()
    }

    override fun printStatus() {
        println("Package delivered to post office, not received yet.")
    }

}
