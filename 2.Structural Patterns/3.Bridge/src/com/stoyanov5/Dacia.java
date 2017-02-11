package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 11-Feb-17.
 */
public class Dacia extends Car {
    private int distance;

    public Dacia(CarAPI carAPI, int distance) {
        super(carAPI);
        this.distance = distance;
    }

    @Override
    public void drive() {
        carAPI.driveCar(distance);
    }
}
