package com.company;

public class M5F90Car implements Car{

    public M5F90Car(CarSeries carSeries){
        System.out.println("This is super car made by BMW - " + carSeries);
    }

    @Override
    public void getCharacteristics() {
        System.out.println("Under the hood of the new BMW M5 F90 model, " +
                        "an upgraded 4.4-liter V8 twin-turbo was registered, " +
                        "the output of which was increased from 560 to 600 " +
                        "\"horses\" and 700 Nm of torque\n");
    }
}
