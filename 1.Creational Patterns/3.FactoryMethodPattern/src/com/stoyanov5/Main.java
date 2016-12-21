package com.stoyanov5;

public class Main {

    public static void main(String[] args) {
        CarFactory bmwFactory = new BmwCarFactory();
        Car myCar = bmwFactory.getCar();
        myCar.printCar();
        myCar.driveCar(20);
        System.out.println(myCar.toString());

        System.out.println();

        CarFactory mercedesFactory = new MercedesCarFactory();
        Car myOtherCar = mercedesFactory.getCar();
        myOtherCar.printCar();
        myOtherCar.driveCar(50);
        myOtherCar.driveCar(500);
        System.out.println(myOtherCar.toString());
    }
}
