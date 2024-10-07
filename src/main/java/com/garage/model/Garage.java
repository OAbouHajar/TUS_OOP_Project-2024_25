
package com.garage.model;

import com.garage.exception.InvalidRepairCostException;
import com.garage.model.Car;

import java.util.Optional;

// Interface for managing cars in a garage.
public interface Garage {
    String garageName();
    void addCar(Car car);
    Optional<Car> getCar(String model);
    void performRepair(String model, double cost) throws InvalidRepairCostException;

    static String serviceHours() {
        return "Garage operates from 9 AM to 6 PM";
    }
}
