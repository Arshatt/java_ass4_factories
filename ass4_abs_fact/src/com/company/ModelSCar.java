package com.company;

public class ModelSCar implements Car{

    public ModelSCar(CarSeries carSeries){
        System.out.println("This is the car made by Tesla -" + carSeries);
    }

    @Override
    public void getCharacteristics() {
        System.out.println("The main difference from other versions is power. " +
                "Acceleration speed to 100 km / h in 2.5 seconds can not boast of any electric car in the world. " +
                "Thus, the Tesla Model S P100D can be classified as the first supercar among electric vehicles.");
    }
}
