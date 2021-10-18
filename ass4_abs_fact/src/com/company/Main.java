package com.company;

public class Main {

    public static void main(String[] args) {
	VehicleFactory bmwVehicleFactory = new BMWVehicleFactory();

    Car m5f90 = bmwVehicleFactory.createCar(Car.CarSeries.MSeries);
    m5f90.getCharacteristics();

    Truck x7 = bmwVehicleFactory.createTruck(Truck.TruckSeries.CyberTrucks);
    x7.getCharacteristics();
    }
}
