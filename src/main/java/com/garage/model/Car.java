package com.garage.model;

import com.garage.resources.Customer;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

// Car record represents an immutable car object.
public record Car(String brand, String model, CarType type, String regNumber, int year, Customer owner) {

    // Static set to store all unique registration numbers
    private static final Set<String> regNumbers = new HashSet<>();

    // Validate the car's year and registration number to ensure it's valid and unique.
    public Car {
        if (year < 1886 || year > Calendar.getInstance().get(Calendar.YEAR)) {
            throw new IllegalArgumentException("Invalid year for car: " + year);
        }
        // Check for uniqueness of registration number
        if (regNumbers.contains(regNumber)) {
            throw new IllegalArgumentException("#### Registration number must be unique: " + regNumber + " Car: " + brand + " " + model + "Was not added to the system"
            );
        }
        // Add the registration number to the set after successful validation
        regNumbers.add(regNumber);
    }

    @Override
    public String regNumber() {
        return regNumber;
    }

    public String getCarDetails() {
        return brand + " " + model + " (" + year + ") Owner: " + owner.getName() + " Owner Phone: " + owner.getPhoneNumber();
    }

    // Optional method to remove a registration number (for cleanup)
    public static void removeRegNumber(String regNumber) {
        regNumbers.remove(regNumber);
    }
}
