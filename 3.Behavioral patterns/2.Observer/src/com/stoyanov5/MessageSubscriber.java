package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 03-Feb-17.
 */
public class MessageSubscriber implements Observer {

    private String name;
    // Subject instance
    private Subject message;

    public MessageSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String messageLocal = (String) message.getUpdate(this);
        if (messageLocal == null) {
            System.out.println(name + " - No new message at the moment.");
        }
        else
            System.out.println(name + " - Your message is: " + messageLocal);
    }

    @Override
    public void setSubject(Subject subject) {
        this.message = subject;
    }
}
