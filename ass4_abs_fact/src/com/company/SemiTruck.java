package com.company;

public class SemiTruck implements Truck{

    public SemiTruck(TruckSeries truckSeries){
        System.out.println("This is Truck manufactured by Tesla:" + truckSeries);
    }

    @Override
    public void getCharacteristics() {
        System.out.println("Each truck and trailer combo would weigh 80,000 pounds" +
                " fully loaded and run a daily 100-mile route at an average top speed of 60 mph. " +
                "Diesel fuel for the calculation was figured at $2.50 a gallon," +
                " versus 7 cents a kilowatt-hour for electricity to charge the Semi.");
    }
}
