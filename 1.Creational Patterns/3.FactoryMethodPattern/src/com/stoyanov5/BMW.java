package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 21-Dec-16.
 */
public class BMW implements Car {

    private int totalKilometers = 0;

    @Override
    public void printCar() {
        System.out.println("You have a BMW");
    }

    @Override
    public int driveCar(int kilometers) {
        return totalKilometers += kilometers;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "totalKilometers=" + totalKilometers +
                '}';
    }
}
