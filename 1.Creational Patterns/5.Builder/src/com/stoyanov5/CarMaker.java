package com.stoyanov5;

/**
 * Created by Krasimir Stoyanov on 21-Dec-16.
 */

class CarMaker {
    private final int engineCylinders;
    private final int horsePowers;
    private final String brand;
    private final String color;

    static class CarBuilder {
        // Required constructor parameters
        private final int engineCylinders;
        private final String brand;

        // Optional parameters - initialized to default values
        private int horsePowers = 100;
        private String color = "black";

        CarBuilder(int engineCylinders, String brand) {
            this.engineCylinders = engineCylinders;
            this.brand = brand;
        }

        CarBuilder horsePowers(int value) {
            horsePowers = value;
            return this;
        }

        CarBuilder color(String value) {
            color = value;
            return this;
        }

        CarMaker build() {
            return new CarMaker(this);
        }
    }

    private CarMaker(CarBuilder carBuilder) {
        engineCylinders = carBuilder.engineCylinders;
        horsePowers = carBuilder.horsePowers;
        brand = carBuilder.brand;
        color = carBuilder.color;
    }

    @Override
    public String toString() {
        return "CarMaker{" +
                "engineCylinders=" + engineCylinders +
                ", horsePowers=" + horsePowers +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
