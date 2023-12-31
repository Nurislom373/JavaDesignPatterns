package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 12/31/2023 11:34 PM
 */
public interface ChatMediator {

    void joinChat(User user);

    void sendMessage(String message, User sender);

}
