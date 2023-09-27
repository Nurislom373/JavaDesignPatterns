package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 9/27/2023 7:48 AM
 */
public class ReceivedState implements PackageState {

    @Override
    public void next(Package pkg) {
        System.out.println("This package is already received by a client.");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("End.");
    }
}
