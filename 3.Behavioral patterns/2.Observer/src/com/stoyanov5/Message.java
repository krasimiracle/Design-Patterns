package com.stoyanov5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Krasimir Stoyanov on 03-Feb-17.
 */
public class Message implements Subject {

    private ArrayList<Observer> observers;
    private String message;
    private boolean isChanged;
    private final Object MUTEX = new Object();


    public Message() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException("Observer is null");
        synchronized (MUTEX) {
            if (!observers.contains(observer)) observers.add(observer);
        }
    }

    @Override
    public void deregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        ArrayList<Observer> observersLocal;

        synchronized (MUTEX) {
            if (!isChanged) return;
            observersLocal = new ArrayList<>(this.observers);
            this.isChanged = false;
        }
        for (Observer observer : observersLocal) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void sendMessage(String message) {
        System.out.println("The message is: " + message);
        this.message = message;
        this.isChanged = true;
        notifyObservers();
    }
}
