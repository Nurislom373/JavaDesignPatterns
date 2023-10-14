package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/14/2023 9:51 PM
 */
public class Bus implements Vehicle {

    private final String description;

    public Bus(String description) {
        this.description = description;
    }

    @Override
    public void aboutMe(String color) {
        System.out.print(description + " with " + color + " color.");
    }

}
