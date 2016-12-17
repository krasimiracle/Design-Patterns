package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 17-Dec-16.
 */

class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    // Required for instantiation
    private Singleton() {
    }

    /**
     * Static instance of Singleton.
     */
    static Singleton getInstance() {
        return INSTANCE;
    }

    /**
     * Methods which make use of Singleton
     */

    void printHelloSingleton() {
        System.out.println("Hello from a singleton!");
    }
}
