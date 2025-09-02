package com.atech.message;

public class Message {
    private final String origin;
    private final String content;

    public Message(String origin, String content) {
        this.origin = origin;
        this.content = content;
    }

    public String getOrigin() {
        return origin;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "origin='" + origin + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
