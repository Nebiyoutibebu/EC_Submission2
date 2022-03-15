package com.questiontwo;

public class CarFactory {

    private CarFactory() {
        System.out.println(" Volvo Cars");
    }

    private static CarFactory bilFabrik = new CarFactory();

    public static CarFactory getInstance() {
        return bilFabrik;
    }

    public Car newCar() {
        return new Car();
    }

}