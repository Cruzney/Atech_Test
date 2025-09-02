package com.atech.message;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher {
    private final List<MessageSubscriber> subscribers = new ArrayList<>();

    public void subscribe(MessageSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(MessageSubscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishMessage(Message message) {
        for (MessageSubscriber subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
