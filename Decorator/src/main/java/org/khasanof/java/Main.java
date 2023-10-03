package org.khasanof.java;

import org.khasanof.java.car.RealCar;
import org.khasanof.java.car.decorators.LuxuryDecorator;
import org.khasanof.java.car.decorators.SportDecorator;

public class Main {

    public static void main(String[] args) {

        LuxuryDecorator decorator = new LuxuryDecorator(new SportDecorator(new RealCar()));
        decorator.assemble();

    }

}
