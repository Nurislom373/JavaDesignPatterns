package org.khasanof.shape;

/**
 * @author Nurislom
 * @see org.khasanof.shape
 * @since 02.08.2023 10:36
 */
public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
