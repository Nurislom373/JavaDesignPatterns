package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/25/2023 9:43 AM
 */
public class Rectangle implements RectInterface {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void aboutMe() {
        System.out.println("Shape type: Rectangle.");
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
