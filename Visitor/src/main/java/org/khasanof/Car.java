package org.khasanof;

import java.util.List;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 1/14/2024 11:02 PM
 */
public class Car implements CarElement {

    private final List<CarElement> elements;

    public Car() {
        this.elements = List.of(
                new Wheel("front left"), new Wheel("front right"),
                new Wheel("back left"), new Wheel("back right"),
                new Body(), new Engine()
        );
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        elements.forEach(carElement -> carElement.accept(visitor));
        visitor.visit(this);
    }
}
