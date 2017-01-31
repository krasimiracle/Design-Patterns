package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 31-Jan-17.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int type) {
        this.type = type;
    }

    @Override
    void print(String message) {
        System.out.println("Error logger output: " + message);
    }
}
