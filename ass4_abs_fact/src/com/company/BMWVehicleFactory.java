package com.company;

public class BMWVehicleFactory implements VehicleFactory{

    @Override
    public Car createCar(Car.CarSeries carSeries) {
        return new M5F90Car(carSeries);
    }

    @Override
    public Truck createTruck(Truck.TruckSeries truckSeries) {
        return new X7Truck(truckSeries);
    }
}
