//class used for setting date in calender
package other;

import contractor.Vet;

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

}
