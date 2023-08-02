package org.khasanof.shape;

/**
 * @author Nurislom
 * @see org.khasanof.shape
 * @since 02.08.2023 10:37
 */
public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
