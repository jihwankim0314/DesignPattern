package org.designpattern._03_behavioral._1_external_communication._4_mediator.code;

public class Client {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "A");
        User user2 = new ChatUser(chatRoom, "B");
        User user3 = new ChatUser(chatRoom, "C");
        User user4 = new ChatUser(chatRoom, "D");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.send("Hello, world!");
    }
}
