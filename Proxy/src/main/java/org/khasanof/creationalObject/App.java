package org.khasanof.creationalObject;

public class App {
    public static void main(String[] args) {
        Vrtx vrtx = new VrtxProxy();
        vrtx.create();
        vrtx.create();
    }
}
