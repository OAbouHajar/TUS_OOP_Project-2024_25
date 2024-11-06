
package com.garage.staff;

import com.garage.model.Car;
import com.garage.staff.Staff;

// Represents a manager who can approve repairs in the garage.
public final class Manager extends Staff {
    public Manager(String name, int experienceYears) {
        // Call the constructor of the Staff class
        super(name, experienceYears);
    }

    @Override
    public String getRole() {
        return "Manager";
    }

    public void approveRepair(Car car) {
        System.out.println(name + " approved the repair for " + car.regNumber());
    }
}
