package org.khasanof.kt

import java.util.Objects

class KtPackage {

    var state: KtPackageState? = null
        get() {
            if (Objects.isNull(field)) {
                return KtOrderedState()
            }
            return field
        }

    fun previousState() {
        state?.prev(this)
    }

    fun nextState() {
        state?.next(this)
    }

    fun printStatus() {
        state?.printStatus()
    }

}
