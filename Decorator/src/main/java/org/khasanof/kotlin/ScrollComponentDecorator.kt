package org.khasanof.kotlin

class ScrollComponentDecorator(component: Component) : ComponentDecorator(component) {

    @Override
    override fun draw() {
        super.draw()
        print("Scroll Feature Active, ")
    }

}
