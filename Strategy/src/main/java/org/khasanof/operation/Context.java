package org.khasanof.operation;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int var1, int var2) {
        return strategy.doOperation(var1, var2);
    }
}
