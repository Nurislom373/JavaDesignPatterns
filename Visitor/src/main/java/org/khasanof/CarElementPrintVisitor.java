package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 1/14/2024 11:06 PM
 */
public class CarElementPrintVisitor implements CarElementVisitor {

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Visiting car");
    }
}
