package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/25/2023 9:45 AM
 */
public class Triangle implements TriInterface {

    private final double baseLength;
    private final double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    @Override
    public void aboutTriangle() {
        System.out.println("Shape type: Triangle.");
    }

    @Override
    public double calculateTriangleArea() {
        return 0.5 * baseLength * height;
    }

}
