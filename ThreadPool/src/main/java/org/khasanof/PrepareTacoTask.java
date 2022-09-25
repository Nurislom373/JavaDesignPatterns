package org.khasanof;

public class PrepareTacoTask extends Task {

    private static final int TIME_PER_TACO_PREPARE = 10;

    public PrepareTacoTask(int countTaco) {
        super(countTaco * TIME_PER_TACO_PREPARE);
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getClass().getSimpleName(), super.toString());
    }
}
