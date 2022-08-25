package org.khasanof.internet;

public class Server implements Internet {

    @Override
    public void connectToServer(String serverName) throws InterruptedException {
        System.out.println("Connecting to " + serverName);
        Thread.sleep(3000);
        System.out.println("Successfully connect server {" + serverName + "}.");
    }

}
