package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 21-Dec-16.
 */
public class BmwCarFactory implements CarFactory {

    @Override
    public Car getCar() {
        return new BMW();
    }
}
