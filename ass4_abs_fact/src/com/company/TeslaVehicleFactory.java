package com.company;

public class TeslaVehicleFactory implements VehicleFactory{

    @Override
    public Car createCar(Car.CarSeries carSeries) {
        return new ModelSCar(carSeries);
    }

    @Override
    public Truck createTruck(Truck.TruckSeries truckSeries) {
        return null;
    }
}
