package org.khasanof.java;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/14/2023 9:52 PM
 */
public class FutureVehicle implements Vehicle {

    private final String description;

    public FutureVehicle(String description) {
        this.description = description;
    }

    @Override
    public void aboutMe(String color) {
        System.out.print(description + " with " + "a blue (default) color.");
    }
}
