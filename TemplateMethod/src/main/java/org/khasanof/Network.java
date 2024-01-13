package org.khasanof;

import java.nio.charset.StandardCharsets;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 1/13/2024 12:52 PM
 */
public abstract class Network {

    protected final String username;
    protected final String password;

    protected Network(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean post(String message) {
        if (login(username, password)) {
            boolean result = sendData(message.getBytes(StandardCharsets.UTF_8));
            logout();
            return result;
        }
        return false;
    }

    protected void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public abstract boolean login(String username, String password);
    public abstract boolean sendData(byte[] data);
    public abstract void logout();

}
