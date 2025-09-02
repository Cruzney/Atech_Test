package com.atech.message;

public class ConcreteSubscriberB implements MessageSubscriber {
    @Override
    public void update(Message message) {
        System.out.println("ConcreteSubscriberB received message: " + message);
    }
}
