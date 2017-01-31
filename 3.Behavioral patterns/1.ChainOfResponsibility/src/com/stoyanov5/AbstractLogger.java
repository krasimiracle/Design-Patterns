package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 31-Jan-17.
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int ERROR = 2;
    public static int DEBUG = 3;

    int type;

    AbstractLogger logger;

    public void setLogger(AbstractLogger logger) {
        this.logger = logger;
    }

    public void log(int type, String message) {
        if (this.type <= type) {
            print(message);
        }
        if (logger != null) {
            logger.log(type,message);
        }
    }

    abstract void print(String message);
}
