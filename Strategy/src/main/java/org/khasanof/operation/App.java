package org.khasanof.operation;

public class App {
    public static void main(String[] args) {
        Context contextAdd = new Context(new OperationAdd());
        System.out.println(contextAdd.executeStrategy(10, 5));

        Context contextSubstract = new Context(new OperationSubstract());
        System.out.println(contextSubstract.executeStrategy(10, 5));

        Context contextMultiply = new Context(new OperationMultiply());
        System.out.println(contextMultiply.executeStrategy(10, 5));
    }
}
