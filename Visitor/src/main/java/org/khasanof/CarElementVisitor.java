package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 1/14/2024 10:57 PM
 */
public interface CarElementVisitor {

    void visit(Wheel wheel);

    void visit(Body body);

    void visit(Engine engine);

    void visit(Car car);
}
