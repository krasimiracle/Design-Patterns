package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 11-Feb-17.
 */
public abstract class Car {
    protected CarAPI carAPI;

    public Car(CarAPI carAPI) {
        this.carAPI = carAPI;
    }

    public abstract void drive();
}
