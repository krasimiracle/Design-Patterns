package com.stoyanov5;

public class SingletonDemo {

    public static void main(String[] args) {

        Singleton singletonInstance = Singleton.getInstance();

        singletonInstance.printHelloSingleton();
    }
}
