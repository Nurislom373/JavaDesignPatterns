package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 1/14/2024 10:57 PM
 */
public class Wheel implements CarElement {

    private final String name;

    public Wheel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
