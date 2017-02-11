package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 11-Feb-17.
 */
public class SlowCar implements CarAPI {
    @Override
    public void driveCar(int distance) {
        System.out.println("You drove the distance of " + distance + " relatively slow");
    }
}
