package org.solvd.zoo.contractor;

import org.solvd.zoo.interfacezoo.PayFor;
import org.solvd.zoo.other.CalenderDate;

import java.time.LocalDate;

public final class ClientGroup extends Client implements PayFor {
    //field
    private String name;
    private CalenderDate calenderDate;

    //constructor

    public ClientGroup(LocalDate buyDate, int count,TicketType ticketType, String name, CalenderDate calenderDate) {
        super(buyDate, count,ticketType);
        this.name = name;
        this.calenderDate = calenderDate;
    }

    public ClientGroup(LocalDate buyDate, int count, TicketType ticketType) {
        super(buyDate, count, ticketType);
    }
    //methode


    @Override
    public void pay(int number, int payAmount) {
        System.out.println("Pay for group ticket");
        super.pay(number, payAmount);
    }

    @Override
    public void receivePay(int number,int payAmount) {
        System.out.println("Anual pay for group ticket");
        super.receivePay(number,payAmount);
    }

    @Override
    public String toString() {
        return "ClientGroup{" +
                "name='" + name + '\'' +
                ", calenderDate=" + calenderDate +
                ", buyDate=" + buyDate +
                ", count=" + count +
                '}';
    }

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
