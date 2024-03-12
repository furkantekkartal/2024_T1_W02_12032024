/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_t1_w02_12032024;

public class Date {

    private MONTH month; // use enum type MONTH
    private int day; // 1-31 based on month
    private int year; // any year

    public Date(String month, int day, int year) {
        this.year = year;
        for (MONTH temp : MONTH.values())//iterate through the months
        {
            if (temp.getNAME().equalsIgnoreCase(month)) {
                this.month = temp;
            }
        }
        if ((day >= 1) && (day <= this.month.getMAX_DAYS())) {
            this.day = day;
        } else {
            System.out.println(
            "Date has an incorrect value, date will  be set to 1"); 
 this.day = 1; // do not do this in practice – throw an exception
        }
    }

    @Override
    public String toString() {
        return String.format("%d %s %d", this.day,
                this.month.getNAME(), this.year);
    }
} //end of class Date
