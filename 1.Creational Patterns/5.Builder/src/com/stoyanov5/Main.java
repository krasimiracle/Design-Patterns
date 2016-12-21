package com.stoyanov5;

public class Main {

    public static void main(String[] args) {

        CarMaker bmw = new CarMaker.CarBuilder(8, "BMW").horsePowers(200).color("green").build();
        CarMaker mercedes = new CarMaker.CarBuilder(12, "Mercedes").horsePowers(250).color("gray").build();

        System.out.println(bmw.toString());
        System.out.println();
        System.out.println(mercedes.toString());
    }
}
