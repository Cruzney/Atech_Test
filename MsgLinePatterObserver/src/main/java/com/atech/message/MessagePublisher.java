package com.atech.message;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MessagePublisher {
    private final List<MessageSubscriber> subscribers = new CopyOnWriteArrayList<>();

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
