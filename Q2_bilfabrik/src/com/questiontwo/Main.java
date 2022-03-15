package com.questiontwo;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = CarFactory.getInstance();

        Car Volvo = carFactory.newCar();
        Volvo.setCarId(1000001);
        Volvo.setModel(" XC90");
        Volvo.setProductionDate(2022);
        Volvo.setPrice(669000);
        Volvo.setAssembly("Sweden");
        System.out.println(Volvo);

    }

}