package org.solvd.zoo.contractor;

import org.solvd.zoo.interfacezoo.Pay;

import java.util.Date;

public class Client implements Pay {
    //field
    protected Date buyDate;
    protected int count;
    private TicketType ticketType;

    //constructor

    public Client(Date buyDate, int count) {
    }

    public Client(Date buyDate, int count, TicketType ticketType) {
        this.buyDate = buyDate;
        this.count = count;
        this.ticketType = ticketType;
    }

    @Override
    public void pay() {
        System.out.println("Pay for ticket");
    }

    @Override
    public void receivePay() {
        System.out.println("Pay back the ticket that cannot be used");
    }
    //methode

    public Date getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Date buyDate) {
        this.buyDate = buyDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
