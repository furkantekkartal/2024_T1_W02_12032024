/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_t1_w02_12032024;

import java.util.Calendar;

public class EmployeeDriver {

    public static void main(String[] args) {
        Employee first = new Employee("Mr", "Scott", "Smith");
        System.out.println("number of Employees:"
                + Employee.getEmployeeCount());
        Employee second = new Employee("Miss", "Lis", "Paul");
        System.out.println("number of Employees: "
                + Employee.getEmployeeCount());
        Date birthDate = new Date("january", 15, 1990);
        Calendar date = Calendar.getInstance();
        date.set(1995, 3, 1);
        Employee third = new Employee("Dr", "Nick", "Banks",
                birthDate, date);
        System.out.println(third);
        System.out.println("number of Employees: "
                + Employee.getEmployeeCount());
    } // end of main method
} // end of class
