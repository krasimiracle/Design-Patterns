package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 03-Feb-17.
 */
public interface Subject {

    public void register(Observer observer);

    public void deregister(Observer observer);

    public void notifyObservers();

    public Object getUpdate(Observer observer);
}
