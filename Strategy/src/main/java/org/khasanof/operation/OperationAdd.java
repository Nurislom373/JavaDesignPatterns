package org.khasanof.operation;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int var1, int var2) {
        return var1 + var2;
    }
}
