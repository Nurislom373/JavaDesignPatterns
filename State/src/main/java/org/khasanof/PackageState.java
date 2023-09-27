package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 9/27/2023 7:45 AM
 */
public interface PackageState {

    void next(Package pkg);

    void prev(Package pkg);

    void printStatus();

}
