package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 31-Jan-17.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int type) {
        this.type = type;
    }

    @Override
    void print(String message) {
        System.out.println("Console logger output: " + message);
    }
}
