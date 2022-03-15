package com.questiontwo;

public class Car {

    private int carId;
    private String model;
    private double price;
    private String assembly;
    private int date;

    Car() {
        System.out.println("One Volvo just made ");
    }

    public int getCarId() {
        return carId;
    }
    public void setCarId(int carId) {
        this.carId = carId;
    }

    public int getProductionDate() {
        return date;
    }

    public void setProductionDate(int date) {
        this.date = date;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String getAssembly() {
        return assembly;
    }

    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    @Override
    public String toString() {
        return "Car [carId=" + carId + ", model=" + model + ", price=" + price + ", date=" + date +", assembly=" + assembly+"]";
    }

}