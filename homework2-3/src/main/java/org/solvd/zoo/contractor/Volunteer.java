package org.solvd.zoo.contractor;

import org.solvd.zoo.interfacezoo.Clean;
import org.solvd.zoo.interfacezoo.Feed;

import java.util.Date;

public final class Volunteer extends ContractorInfo implements Clean , Feed {
    //fields
    private String benefits;
    private String description;
    //constructor

    public Volunteer() {
        this.benefits = "none";
        this.description = "none";
    }

    public Volunteer(String benefits, String description) {
        this.benefits = benefits;
        this.description = description;
    }

    public Volunteer(String firstName, String lastName, String jobdescription, Date avalability) {
        super(firstName, lastName, jobdescription, avalability);
    }
//methode

    @Override
    public String toString() {
        return "Volunteer{" +
                "benefits = '" + benefits + '\'' +
                ", description = '" + description + '\'' +
                '}';
    }

    @Override
    public void cleaning() {

    }

    @Override
    public void useUtilities() {

    }

    @Override
    public void schedule() {

    }

    @Override
    public void reschedule() {

    }
    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public void feed() {

    }
}
