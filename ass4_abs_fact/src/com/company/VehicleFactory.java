package com.company;

public interface VehicleFactory {

    Car createCar(Car.CarSeries carSeries);

    Truck createTruck(Truck.TruckSeries truckSeries);
}
