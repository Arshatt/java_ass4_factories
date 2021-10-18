package com.company;

public class X7Truck implements Truck{

    public X7Truck(TruckSeries truckSeries){
        System.out.println("This is truck manufactured by BMW: " + truckSeries);
    }

    @Override
    public void getCharacteristics() {
        System.out.println("BMW X7 xDrive40i:\n" +
                "Fuel consumption in l / 100 km (combined): 10.8-10.1\n" +
                "CO2 emissions in g / km (combined): 247 to 231");
    }
}
