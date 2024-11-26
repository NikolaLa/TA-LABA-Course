//class used for setting date in calender
package org.solvd.zoo.contractor;
import java.util.Objects;

public class Account {
    //field
    private int number;
    private int payAmount;
    //constructor
    public Account(){
    }

    public Account( int number, int payAmount) {

        this.number = number;
        this.payAmount = payAmount;
    }

    //methode


    @Override
    public String toString() {
        return "Account{" +
                ", number = " + number +
                ", payAmount = " + payAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account account)) return false;
        return number == account.number && payAmount == account.payAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash( number, payAmount);
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
