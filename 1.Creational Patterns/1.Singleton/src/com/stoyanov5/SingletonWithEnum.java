package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 17-Dec-16.
 */

public enum  SingletonWithEnum {
    INSTANCE;

    public void printSingletonWithEnum() {
        System.out.println("Hi from an enum singleton!");
    }
}
