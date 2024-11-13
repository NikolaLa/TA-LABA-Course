package org.solvd.zoo.contractor;

import org.solvd.zoo.other.CalenderDate;

import java.util.Date;

public class ClientGroup extends Client{
    //field
    private String name;
    CalenderDate calenderDate;

    //cosntructor
    ClientGroup(Date buyDate, int count) {
        super(buyDate, count);
    }
    //methode

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CalenderDate getCalenderDate() {
        return calenderDate;
    }

    public void setCalenderDate(CalenderDate calenderDate) {
        this.calenderDate = calenderDate;
    }
}
