
package com.garage.service;

import com.garage.model.Garage;
import com.garage.exception.InvalidRepairCostException;
import com.garage.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Implements the Garage interface to manage a collection of cars.
public class CarGarage implements Garage {
    private final String name;
    private final List<Car> cars = new ArrayList<>();

    // Constructor to initialize the garage with a name.
    public CarGarage(String name) {
        this.name = name;
    }

    @Override
    public String garageName() {
        return this.name;
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
        System.out.println(car.getCarDetails() + " added to " + name);
    }

    @Override
    public Optional<Car> getCars(String regNumber) {
//        return cars.stream().filter(car -> car.model().equals(model)).findFirst();
        return cars.stream().filter(car -> car.regNumber().equals(regNumber)).findFirst();
    }


    // Perform a repair on a car by its model name, if the cost is valid.
    @Override
    public void issueRepairInvoice(Car carInstance, double cost) throws InvalidRepairCostException {

        if (cost < 0) {
            throw new InvalidRepairCostException("Repair cost cannot be negative, please check the cost value again.");
        }

        getCars(carInstance.regNumber()).ifPresentOrElse(
            car -> System.out.println("Repair performed on " + car.getCarDetails() + " for $" + cost),
            () -> System.out.println("Car not found in garage.")
        );
    }
}
