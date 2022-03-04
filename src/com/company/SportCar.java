package com.company;

public class SportCar extends Car {
    private double dvigatel;
    private Color color;

    public double getDvigatel() {
        return dvigatel;
    }

    public Color getColor() {
        return color;
    }

    public SportCar(String model, int age, double dvigatel, Color color) {
        super(model, age);
        this.dvigatel = dvigatel;
        this.color = color;
    }
    public void siganl(){
        System.out.println("bam");
    }
    public final void signal(String signal){
        System.out.println(signal);
    }
    public String info(){
        return "\nmodel"+getModel()+
                "\nage"+getAge()+
                "\ndvigatel"+dvigatel+
                "\ncolor"+color;
    }
}
