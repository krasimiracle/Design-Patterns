package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 19-Dec-16.
 */
public abstract class CarFactory {

    public static Car getBMW() {
        return new BMW();
    }

    public static Car getMercedes() {
        return new Mercedes();
    }
}
