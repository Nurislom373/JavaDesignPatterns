package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 10/25/2023 9:47 AM
 */
public class Adapter implements RectInterface {

    private final TriInterface triInterface;

    public Adapter(TriInterface triInterface) {
        this.triInterface = triInterface;
    }

    @Override
    public void aboutMe() {
        triInterface.aboutTriangle();
    }

    @Override
    public double calculateArea() {
        return triInterface.calculateTriangleArea();
    }
}
