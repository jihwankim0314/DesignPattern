package org.designpattern._03_behavioral._1_external_communication._4_mediator.code;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sendUser) {
        for (User user : users) {
            if (user != sendUser) {
                user.receive(message);
            }
        }

    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
