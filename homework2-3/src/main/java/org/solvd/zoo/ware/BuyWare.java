//class used for setting date in calender
package org.solvd.zoo.ware;

import org.solvd.zoo.contractor.Seller;

import java.util.Objects;

public abstract class BuyWare {
    //fields
    private String name;
    private float amount;
    private String mesaurment;
    private String dataTime;
    private Seller seller; // can be volunteer seller?
    private String category;

    //constructore
    public BuyWare(){

    }

    public BuyWare(String name, float amount, String mesaurment, String dataTime, Seller seller, String category) {
        this.name = name;
        this.amount = amount;
        this.mesaurment = mesaurment;
        this.dataTime = dataTime;
        this.seller = seller;
        this.category = category;
    }
    //methode

    @Override
    public String toString() {
        return "BuyWare{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", mesaurment='" + mesaurment + '\'' +
                ", dataTime='" + dataTime + '\'' +
                ", seller=" + seller +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BuyWare buyWare = (BuyWare) o;
        return Float.compare(amount, buyWare.amount) == 0 && Objects.equals(name, buyWare.name) && Objects.equals(mesaurment, buyWare.mesaurment) && Objects.equals(dataTime, buyWare.dataTime) && Objects.equals(seller, buyWare.seller) && Objects.equals(category, buyWare.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amount, mesaurment, dataTime, seller, category);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getMesaurment() {
        return mesaurment;
    }

    public void setMesaurment(String mesaurment) {
        this.mesaurment = mesaurment;
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
