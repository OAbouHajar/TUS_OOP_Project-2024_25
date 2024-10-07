
package com.garage.model;

import java.util.Calendar;

// Car record represents an immutable car object.
public record Car(String brand, String model, CarType type, int year) {
    // Validate the car's year to ensure it's within a valid range.
    public Car {
        if (year < 1886 || year > Calendar.getInstance().get(Calendar.YEAR)) {
            throw new IllegalArgumentException("Invalid year for car: " + year);
        }
    }

    public String getCarDetails() {
        return brand + " " + model + " (" + year + ")";
    }
}
