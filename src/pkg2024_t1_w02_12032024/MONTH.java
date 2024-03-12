/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_t1_w02_12032024;

public enum MONTH {
    //constants of the enum type- in brackets are arguments to the enum constructor

    Jan("January", 1, 31),
    Feb("february", 2, 29),
    Mar("March", 3, 31),
    Apr("April", 4, 30),
    May("May", 5, 31),
    Jun("June", 6, 30),
    Jul("July", 7, 31),
    Aug("August", 8, 31),
    Sep("September", 9, 30),
    Oct("October", 10, 31),
    Nov("November", 11, 30),
    Dec("December", 12, 31);
    //instance fields 
    private final String NAME; //name of month
    private final int NUMBER; // number of month
    private final int MAX_DAYS; //maximum number of days in a month

//this constructor is invoked to create the months given in previous slide constructor is private as this cannot used by clients

    private MONTH(String name, int number, int days) {
        this.NAME = name.trim(); //remove any extra white space characters
        this.NUMBER = number;
        this.MAX_DAYS = days;
    }

    public String getNAME() {
        return NAME;
    }

    public int getNUMBER() {
        return NUMBER;
    }

    public int getMAX_DAYS() {
        return MAX_DAYS;
    }

    public static MONTH getFeb() { //a specific MONTH can be returned
        return Feb;
    }
}
