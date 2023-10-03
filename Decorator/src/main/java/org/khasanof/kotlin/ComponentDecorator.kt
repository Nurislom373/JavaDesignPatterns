package org.khasanof.kotlin

abstract class ComponentDecorator(private val component: Component) : Component {

    @Override
    override fun draw() {
        this.component.draw()
    }

}
