//class used for setting date in calender
package org.solvd.zoo.contractor;

import java.util.Date;

public class Account {
    //fields
    private Date dataTime;
    private int number;

    //constructor
    public Account(){

    }

    public Account(Date dataTime, int number) {
        this.dataTime = dataTime;
        this.number = number;
    }

    //methode


    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
