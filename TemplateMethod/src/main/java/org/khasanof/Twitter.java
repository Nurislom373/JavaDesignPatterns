package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 1/13/2024 1:02 PM
 */
public class Twitter extends Network {

    protected Twitter(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.username);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on Twitter");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
        System.out.println("Message: '" + new String(data) + "' was posted on Twitter");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("User: '" + username + "' was logged out from Twitter");
    }
}
