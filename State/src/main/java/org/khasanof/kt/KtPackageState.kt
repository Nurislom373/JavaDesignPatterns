package org.khasanof.kt

interface KtPackageState {

    fun next(pkg: KtPackage)

    fun prev(pkg: KtPackage)

    fun printStatus()

}
