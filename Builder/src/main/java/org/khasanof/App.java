package org.khasanof;

public class App {
    public static void main(String[] args) {
        User user = new User.Builder()
                .withUsername("islom")
                .withPassword("123")
                .withAge(17).build();
        System.out.println("user = " + user);
    }
}
