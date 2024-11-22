//class used for setting date in calender
package org.solvd.zoo.contractor;

import java.util.Date;
import java.util.Objects;

public abstract class Account {
    //fields
    private Date dataTime;
    private int number;
    private int payAmount;
    //constructor
    public Account(){

    }

    public Account(Date dataTime, int number, int payAmount) {
        this.dataTime = dataTime;
        this.number = number;
        this.payAmount = payAmount;
    }

    //methode


    @Override
    public String toString() {
        return "Account{" +
                "dataTime=" + dataTime +
                ", number=" + number +
                ", payAmount=" + payAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account account)) return false;
        return number == account.number && payAmount == account.payAmount && Objects.equals(dataTime, account.dataTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataTime, number, payAmount);
    }

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

    public int getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(int payAmount) {
        this.payAmount = payAmount;
    }
}
