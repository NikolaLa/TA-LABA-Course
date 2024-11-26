package org.solvd.zoo.contractor;

import org.solvd.zoo.interfacezoo.ReceivePay;

import java.util.Objects;

public class Seller implements ReceivePay {
    //field
    private String name;
    private Account account;
    private int payAmount;
    //construcore

    public Seller() {
    }

    public Seller(String name, Account account, int payAmount) {
        this.name = name;
        this.account = account;
        this.payAmount = payAmount;
    }
//methode


    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", account=" + account +
                ", payAmount=" + payAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Seller seller)) return false;
        return payAmount == seller.payAmount && Objects.equals(name, seller.name) && Objects.equals(account, seller.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, account, payAmount);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(int payAmount) {
        this.payAmount = payAmount;
    }

    @Override
    public void receivePay(int number, int payAmount) {

    }
}
