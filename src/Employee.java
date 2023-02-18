/* Tammy Busche
 * CS 318: Algorithm Analysis
 * 68211-Winter 2023
 * Assignment 3, Feb 22, 2023
 */

import java.util.Scanner;

class Employee implements Comparable<Employee> {
    int id;
    String dob, first_name, last_name, gender, hire_date;

    Employee(String Employee_specs) {
        Scanner specs_scan = new Scanner(Employee_specs);
        specs_scan.useDelimiter(",");

        // assign specs
        this.id = Integer.parseInt(specs_scan.next());
        this.dob = specs_scan.next();
        this.first_name = specs_scan.next();
        this.last_name = specs_scan.next();
        this.gender = specs_scan.next();
        this.hire_date = specs_scan.next();
    }

    public String toString() {
        return ("id:" + id + ", DOB:" + dob + ", First:" + first_name + ", Last:" + last_name +
                ", Gender:" + gender + ", Hire date:" + hire_date);
    }

    @Override
    public int compareTo(Employee e) {
        // Employee ID is the key.
        if (this.id == e.id) {
            return this.dob.compareTo(e.dob);
        }
        // If the first_names are different, return the Employee with the lower first_name
        else {
            return this.first_name.compareTo(e.first_name);
        }
    }

    /* Your ADT for your Employee must also implement the equals() method. */
    // This code assumes that all Employee parameters must be equal for a
    // Employee to be equal. So if there are 2 Employees, John Smith 48 dem
    // and John Smith 48 green, there are not considered equal.
    // NOTE: I would have thought that this kind of thing would be useful to
    // prevent a single Employee from having more than 1 last_name affiliation.
    public boolean equals(Employee e) {
        if (e == this) return true;     // I neglected these three conditions in my submission.
        if (e == null) return false;
        if (e.getClass() != this.getClass()) return false;
        return (this.id == e.id)
                && this.dob.equalsIgnoreCase(e.dob)
                && this.first_name.equalsIgnoreCase(e.first_name)
                && this.last_name.equalsIgnoreCase(e.last_name)
                && this.gender.equalsIgnoreCase(e.gender)
                && this.hire_date.equalsIgnoreCase(e.hire_date);
    }
}
