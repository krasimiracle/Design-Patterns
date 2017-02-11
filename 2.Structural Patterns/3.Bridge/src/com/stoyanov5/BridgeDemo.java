package com.stoyanov5;

public class BridgeDemo {

    public static void main(String[] args) {
        Car w220 = new Mercedes(new FastCar(), 120);
        Car dacia1300 = new Dacia(new SlowCar(), 100);

        w220.drive();
        dacia1300.drive();
    }
}
