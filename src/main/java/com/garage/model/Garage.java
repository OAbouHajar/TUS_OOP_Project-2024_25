
package com.garage.model;

import com.garage.exception.InvalidRepairCostException;

import java.util.Optional;

// Interface for managing cars in a garage.
public interface Garage {
    String garageName();
    void addCar(Car car);
    Optional<Car> getCars(String model);
    void issueRepairInvoice(Car carInstance, double cost) throws InvalidRepairCostException;

    // static methods cannot be overridden
    static String serviceHours() {
        return "Garage operates from 9 AM to 6 PM";
    }
}
