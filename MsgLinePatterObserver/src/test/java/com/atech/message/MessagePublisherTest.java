package com.atech.message;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessagePublisherTest {

    private static class MockSubscriber implements MessageSubscriber {
        private Message receivedMessage;

        @Override
        public void update(Message message) {
            this.receivedMessage = message;
        }

        public Message getReceivedMessage() {
            return receivedMessage;
        }
    }

    @Test
    public void testSubscribeAndPublish() {
        MessagePublisher publisher = new MessagePublisher();
        MockSubscriber subscriber = new MockSubscriber();
        publisher.subscribe(subscriber);

        Message message = new Message("test", "test message");
        publisher.publishMessage(message);

        assertNotNull(subscriber.getReceivedMessage());
        assertEquals("test message", subscriber.getReceivedMessage().getContent());
    }

    @Test
    public void testUnsubscribe() {
        MessagePublisher publisher = new MessagePublisher();
        MockSubscriber subscriber = new MockSubscriber();
        publisher.subscribe(subscriber);
        publisher.unsubscribe(subscriber);

        Message message = new Message("test", "test message");
        publisher.publishMessage(message);

        assertNull(subscriber.getReceivedMessage());
    }

    @Test
    public void testMultipleSubscribersReceiveMessage() {
        MessagePublisher publisher = new MessagePublisher();
        MockSubscriber subscriber1 = new MockSubscriber();
        MockSubscriber subscriber2 = new MockSubscriber();

        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        Message message = new Message("test", "multi-subscriber test");
        publisher.publishMessage(message);

        assertNotNull(subscriber1.getReceivedMessage(), "Subscriber 1 should have received the message");
        assertEquals("multi-subscriber test", subscriber1.getReceivedMessage().getContent());

        assertNotNull(subscriber2.getReceivedMessage(), "Subscriber 2 should have received the message");
        assertEquals("multi-subscriber test", subscriber2.getReceivedMessage().getContent());
    }
}
