package org.khasanof.shape;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 02.08.2023 10:32
 */
public abstract class Shape {

    protected final Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();

}
