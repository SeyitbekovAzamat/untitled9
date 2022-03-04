package com.company;

public class MyCar extends SportCar{
    private String username;

    public String getUsername() {
        return username;
    }

    public MyCar(String model, int age, double dvigatel, Color color, String username) {
        super(model, age, dvigatel, color);
        this.username = username;
    }
    public String info(){
        return super.info()+"\nusername"+username;
    }
}
