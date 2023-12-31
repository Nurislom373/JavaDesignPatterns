package org.khasanof;

public class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ChatUser("Jeck", mediator);
        mediator.joinChat(user1);

        User user2 = new ChatUser("John", mediator);
        mediator.joinChat(user2);

        User user3 = new ChatUser("Anna", mediator);
        mediator.joinChat(user3);

        user1.sendMessage("Hello World!");
    }

}