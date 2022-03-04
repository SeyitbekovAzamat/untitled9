package com.company;

public class Main {

    public static void main(String[] args) {
        SportCar sportCar = new SportCar("BMV", 1995, 2.5, Color.BLEK);
        System.out.println(sportCar.info());

        MyCar myCar = new MyCar("BMV", 2005, 3.5, Color.BLEK, "AZAMAT");
        System.out.println(myCar.info());
        myCar.siganl();
    }

}
