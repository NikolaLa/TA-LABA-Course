package org.solvd.zoo.contractor;

import org.solvd.zoo.other.CalenderDate;

import java.util.Date;

public final class ClientGroup extends Client{
    //field
    private String name;
    private CalenderDate calenderDate;

    //constructor

    public ClientGroup(Date buyDate, int count, String name, CalenderDate calenderDate) {
        super(buyDate, count);
        this.name = name;
        this.calenderDate = calenderDate;
    }

    public ClientGroup(Date buyDate, int count) {
        super(buyDate, count);
    }

    public ClientGroup(Date buyDate, int count, TicketType ticketType) {
        super(buyDate, count, ticketType);
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
