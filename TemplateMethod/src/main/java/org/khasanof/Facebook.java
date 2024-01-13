package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 1/13/2024 12:56 PM
 */
public class Facebook extends Network {

    protected Facebook(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + username);
        System.out.print("Password: ");
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on Facebook");
        return true;
    }

    @Override
    public boolean sendData(byte[] data) {
        System.out.println("Message: '" + new String(data) + "' was posted on Facebook");
        return true;
    }

    @Override
    public void logout() {
        System.out.println("User: '" + username + "' was logged out from Facebook");
    }
}
