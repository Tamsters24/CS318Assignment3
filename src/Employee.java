/* Tammy Busche
 * CS 318: Algorithm Analysis
 * 68211-Winter 2023
 * Assignment 3, Feb 22, 2023
 */

import java.util.Scanner;

class Employee {
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
}
