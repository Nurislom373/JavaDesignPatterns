package org.khasanof.java.car.decorators;

import org.khasanof.java.car.Car;
import org.khasanof.java.car.CarDecorator;

/**
 * @author Nurislom
 * @see org.khasanof.java.car.decorators
 * @since 10/2/2023 6:41 PM
 */
public class SportDecorator extends CarDecorator {

    public SportDecorator(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sport Car.");
    }
}
