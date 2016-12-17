package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 17-Dec-16.
 */

class SingletonWithStaticFactory {
    private static final SingletonWithStaticFactory INSTANCE = new SingletonWithStaticFactory();

    // Required for instantiation
    private SingletonWithStaticFactory() {
    }

    /**
     * Static instance of SingletonWithStaticFactory.
     */
    static SingletonWithStaticFactory getInstance() {
        return INSTANCE;
    }

    /**
     * Methods which make use of SingletonWithStaticFactory
     */
    void printHelloSingleton() {
        System.out.println("Hello from a singleton!");
    }
}
