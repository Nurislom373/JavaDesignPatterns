package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 9/27/2023 7:43 AM
 */
public class Package {

    // bitta context ga o'xshagan narsa qilish kere shunda ushandan foydalanib if/else block lani kichikina qilish oson.
    private PackageState state = new OrderedState();

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }
}
