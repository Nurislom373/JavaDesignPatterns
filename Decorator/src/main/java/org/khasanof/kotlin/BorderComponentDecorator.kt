package org.khasanof.kotlin

class BorderComponentDecorator(component: Component) : ComponentDecorator(component) {

    @Override
    override fun draw() {
        super.draw()
        print("Border Feature Active, ")
    }
}
