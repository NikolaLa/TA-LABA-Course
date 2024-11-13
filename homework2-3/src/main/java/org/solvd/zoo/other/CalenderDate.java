//class used for setting date in calender
package org.solvd.zoo.other;

import org.solvd.zoo.contractor.Vet;

import java.util.Date;

public class CalenderDate {
    //state
    public Date dateTime;
    public String name;

    //constuctor
    public CalenderDate(String name, Date dateTime){
        this.name = name;
        this.dateTime = dateTime;
    }
    //methode
    public String setVetApoitment(Vet vet, Date dateTime, String name){
        this.dateTime = dateTime;
        this.name = name;

        return name;
    }
    public void setEvent(CalenderDate calenderDate){

    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
