package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 31-Jan-17.
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int type) {
        this.type = type;
    }

    @Override
    void print(String message) {
        System.out.println("Debug info output: " + message);
    }
}
