/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_t1_w02_12032024;

import java.util.Calendar;

/**
 *
 * @author Furky_n_Betty
 */
public class Employee {

    private String title;               //to store the title of employee
    private final String FIRST_NAME;    //use capital letters for naming constants to store the first name of employee
    private String lastName;            // to store the last name of employee
    private Date birthdate;             //composed of an object of type Date;
    private Calendar hireDate;          //Calendar is a Java library class which replaces Date.
    
// static has class scope
    private static int employeeCount;   // to store number of employees
    

//Overloaded constructors

//no argument constructor
    public Employee() {
        this("undefined", "undefined", "");
        // increment count of employees created will occur in the constructor called using this in the above statement.
    }

// parameterised constructor
    /**
     *
     * @param title
     * @param firstName
     * @param lastName
     */
    public Employee(String title, String firstName, String lastName) {
        this.title = title;
        this.FIRST_NAME = firstName;
        this.lastName = lastName;
            ++employeeCount;            // increment count of employees created.

    }                                   // end of Constructor


// another constructor to create an employee with dates
    /**
     *
     * @param title
     * @param firstName
     * @param lastName
     * @param birthday
     * @param hired
     */
    public Employee(String title, String firstName, String lastName, Date birthday, Calendar hired) {
        this(title, firstName, lastName); //use the already available constructor
        this.birthdate = birthday;
        this.hireDate = hired;
                                        // increment count of employees created will occur in the constructor called
                                        // using this in the above statement.
    }                                   // end of Constructor

                                        //copy constructor
    public Employee(Employee another) {
                                        //invokes the parmeterised constructor with attribute values of another
        this(another.title, another.FIRST_NAME,
                another.lastName, another.birthdate, another.hireDate);
    }
                                        //Calendar.getTime() returns a Date object. hireDate is of type Calendar

    @Override
    public String toString() {
        return String.format("%s %s %s BirthDate: %s, HireDate: %s", 
                this.getTitle(), 
                this.getFirstName(),
                this.getLastName(), 
                this.getBirthdate().toString(),
                this.getHireDate().getTime().toString());
    }
    
                                        //parameterised constructor
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
                                        //There is no setFirstName(); FIRST_NAME is a constant

    public String getFirstName() {
        return this.FIRST_NAME;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Calendar getHireDate() {
        return hireDate;
    }
                                        // to access a static variable there should be a static method

    public static int getEmployeeCount() {
        return employeeCount;
    }
}                                       // end of class
