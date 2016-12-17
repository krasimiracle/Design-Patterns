package com.stoyanov5;

public class SingletonDemo {

    public static void main(String[] args) {
        // Get Singleton's instance
        SingletonWithStaticFactory singletonWithStaticFactoryInstance = SingletonWithStaticFactory.getInstance();

        // Use methods of Singleton's static factory
        singletonWithStaticFactoryInstance.printHelloSingleton();
        System.out.println();

        /*
         * Preferred way of using Singleton.
         */
        SingletonWithEnum.INSTANCE.printSingletonWithEnum();
    }
}
