package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 1/14/2024 11:00 PM
 */
public class Engine implements CarElement {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
