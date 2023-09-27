package org.khasanof.kt

class KtOrderedState : KtPackageState {

    override fun next(pkg: KtPackage) {
        TODO("Not yet implemented")
    }

    override fun prev(pkg: KtPackage) {
        println("The package is in its root state.")
    }

    override fun printStatus() {
        println("Package ordered, not delivered to the office yet.")
    }

}
