
package com.garage.staff;

// Abstract class representing staff members in the garage.
public sealed abstract class Staff permits Mechanic, Manager {
    protected String name;
    protected int experienceYears;

    public Staff(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public abstract String getRole();
}
