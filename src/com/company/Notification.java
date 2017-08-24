package com.company;
import java.time.LocalDateTime;

public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "hello";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public void showStatus() {

        System.out.println(this.status);

    }

    protected void printSomeText(){
        System.out.println("hello world");
    }

    public String getSubject() {

        return subject;
    }

    public String getBody() {

        return body;
    }

    public LocalDateTime getCreatedAt() {

        return createdAt;

    }

    public void transport() throws NoTransportException {

    }
}
