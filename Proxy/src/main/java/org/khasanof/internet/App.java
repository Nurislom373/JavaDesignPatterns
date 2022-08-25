package org.khasanof.internet;

public class App {
    public static void main(String[] args) {
        Internet internet = new ServerProxy();
        try {
            internet.connectToServer("boom.uz");
            internet.connectToServer("hi.uz");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
