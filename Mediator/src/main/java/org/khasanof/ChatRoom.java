package org.khasanof;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 12/31/2023 11:38 PM
 */
public class ChatRoom implements ChatMediator {

    private final Set<User> users = new HashSet<>();

    @Override
    public void joinChat(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(message);
            }
        }
    }

}
