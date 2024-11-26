package org.solvd.zoo.ware;

import org.solvd.zoo.interfacezoo.Feed;

import java.util.Date;

public final class Vegetable implements Feed {
    //fields
    private boolean isFresh;
    private Date experientDate;

    //constructor

    public Vegetable() {
    }

    public Vegetable(boolean isFresh, Date experientDate) {
        this.isFresh = isFresh;
        this.experientDate = experientDate;
    }
    //methode

    public void feed(){
        System.out.println("Feeding Vegies");
    }
    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public Date getExperientDate() {
        return experientDate;
    }

    public void setExperientDate(Date experientDate) {
        this.experientDate = experientDate;
    }
}
