package org.khasanof.java;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/14/2023 9:50 PM
 */
public class Car implements Vehicle {

    /**
     * This is an intrinsic state:
     * 1.It is not supplied by client.
     * 2.It is independent of the flyweight’s context.
     * 3.This can be shared across.
     * 4.These data are often immutable.
     */
    private final String description;

    public Car(String description) {
        this.description = description;
    }

    // Client supplies the color
    @Override
    public void aboutMe(String color) {
        System.out.print(description + " with " + color + " color.");
    }
}
