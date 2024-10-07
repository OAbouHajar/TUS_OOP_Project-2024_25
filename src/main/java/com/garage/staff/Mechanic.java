
package com.garage.staff;


import com.garage.model.Car;
import com.garage.staff.Staff;

// Represents a mechanic who performs repairs on cars.
public final class Mechanic extends Staff {
    public Mechanic(String name, int experienceYears) {
        super(name, experienceYears);
    }

    @Override
    public String getRole() {
        return "Mechanic";
    }

    public void repair(Car car) {
        System.out.println(name + " is repairing " + car.getCarDetails());
    }
}
