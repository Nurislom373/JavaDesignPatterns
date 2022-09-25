package org.khasanof;

public class CoffeeMakingTask extends Task {

    private static final int TIME_PER_CUP = 5;

    public CoffeeMakingTask(int countCups) {
        super(countCups * TIME_PER_CUP);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getClass().getSimpleName(), super.toString());
    }
}
