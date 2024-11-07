package ware;

import java.util.Date;

public class Vegetable {
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
