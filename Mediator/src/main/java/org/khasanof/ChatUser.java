package org.khasanof;

/**
 * @author Nurislom
 * @see org.khasanof
 * @since 12/31/2023 11:35 PM
 */
public class ChatUser implements User {

    private String name;
    private ChatMediator chatMediator;

    public ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives: " + message);
    }
}
