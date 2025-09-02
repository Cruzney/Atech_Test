package com.atech.message;

public class AppMsgLine {
    public static void main(String[] args) {
        MessagePublisher publisher = new MessagePublisher();

        MessageSubscriber subscriberA = new ConcreteSubscriberA();
        MessageSubscriber subscriberB = new ConcreteSubscriberB();

        publisher.subscribe(subscriberA);
        publisher.subscribe(subscriberB);

        publisher.publishMessage(new Message("AppMsgLine", "First message"));

        System.out.println("\nUnsubscribing ConcreteSubscriberA\n");
        publisher.unsubscribe(subscriberA);

        publisher.publishMessage(new Message("AppMsgLine", "Second message"));
    }
}
