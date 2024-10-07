/*
 *
 * Owner: Osame Abou Hajar
 * Student ID: A00334533
 * OOP1 project 24/25
 *
 * */


// Main class to initialize and test the car garage system.
// It creates instances of Car, Mechanic, and Manager, adds cars to the garage, and performs repairs.

package com.garage;

import com.garage.exception.InvalidRepairCostException;
import com.garage.model.Car;
import com.garage.model.CarType;
import com.garage.model.Garage;
import com.garage.resources.Customer;
import com.garage.service.CarGarage;
import com.garage.staff.Manager;
import com.garage.staff.Mechanic;

public class Main {
    public static void main(String[] args) {
        // Create a garage with a specific name.
        CarGarage myGarage = new CarGarage("Osama's Garage");


        // customers represent the car owner. it can be not an owner too!
        Customer customerOsama = new Customer("Osama", "083-123-1232");
        Customer customerJack = new Customer("Osama", "083-123-1232");

        // Add two cars to the garage.
        Car car1 = new Car("Audi", "A6", CarType.SALON, "151D3242", 2020, customerOsama);
        Car car2 = new Car("Honda", "Civic", CarType.HATCHBACK, "152D3242",2019, customerJack);


        // add another car with same regNumber ...
        try {
            Car car3 = new Car("Toyota", "Corolla", CarType.SALON, "151D3242", 2019, customerOsama);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        myGarage.addCar(car1); // Add the first car
        myGarage.addCar(car2); // Add the second car

        // Create a mechanic and a manager.
        Mechanic mechanic = new Mechanic("John", 5);
        Manager manager = new Manager("Sarah", 10);

        // Perform a repair on one of the cars.
        try {
            myGarage.performRepair(car1.regNumber(), 250);
            mechanic.repair(car1);
            manager.approveRepair(car1.regNumber());

        } catch (InvalidRepairCostException e) {
            System.out.println(e.getMessage());
        }

        // Output the garage's service hours.
        System.out.println(Garage.serviceHours());
    }
}
