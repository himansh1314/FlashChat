package com.himanshflashchat.flashchatnewfirebase;

public class InstantMessage {
    private String mAuthor;
    private String mMessage;

    public InstantMessage(String author, String message) {
        mAuthor = author;
        mMessage = message;
    }

    public InstantMessage() {
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getMessage() {
        return mMessage;
    }
}
