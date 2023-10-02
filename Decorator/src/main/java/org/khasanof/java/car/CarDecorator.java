package org.khasanof.java.car;

/**
 * @author Nurislom
 * @see org.khasanof.java.car
 * @since 10/2/2023 6:16 PM
 */
public abstract class CarDecorator implements Car {

    private final Car car;

    protected CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}
