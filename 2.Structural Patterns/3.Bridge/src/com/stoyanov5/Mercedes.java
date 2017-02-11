package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 11-Feb-17.
 */
public class Mercedes extends Car{

    private int distance = 160;

    public Mercedes(CarAPI carAPI, int distance) {
        super(carAPI);
        this.distance = distance;
    }

    @Override
    public void drive() {
        carAPI.driveCar(distance);
    }
}
