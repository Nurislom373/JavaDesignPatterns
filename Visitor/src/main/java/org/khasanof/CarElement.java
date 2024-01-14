package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 1/14/2024 10:56 PM
 */
public interface CarElement {

    void accept(CarElementVisitor visitor);

}
