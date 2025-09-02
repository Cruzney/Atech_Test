package com.atech.message;

public class ConcreteSubscriberA implements MessageSubscriber {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteSubscriberA received message: " + message);
    }
}
