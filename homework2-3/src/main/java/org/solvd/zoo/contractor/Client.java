package org.solvd.zoo.contractor;

import org.solvd.zoo.interfacezoo.PayFor;
import org.solvd.zoo.interfacezoo.ReceivePay;

import java.time.LocalDate;

public class Client implements PayFor, ReceivePay {
    //field
    protected LocalDate buyDate;
    protected int count;
    private TicketType ticketType;

    //constructor

    public Client(LocalDate buyDate, int count, TicketType ticketType) {
        this.buyDate = buyDate;
        this.count = count;
        this.ticketType = ticketType;
    }
    @Override
    public void pay(int number, int payAmount) {

    }


    //methode

    @Override
    public String toString() {
        return "Client{" +
                "buyDate = " + buyDate +
                ", count = " + count +
                ", ticketType = " + ticketType +
                '}';
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(LocalDate buyDate) {
        this.buyDate = buyDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void receivePay(int number, int payAmount) {
    }
}
