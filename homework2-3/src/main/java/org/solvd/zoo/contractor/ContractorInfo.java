package org.solvd.zoo.contractor;

import org.solvd.zoo.interfacezoo.Cleaning;

import java.util.Date;

public abstract class ContractorInfo implements Cleaning {
     // fields
     private String firstName;
     private String lastName;
     private String jobdescription;
     private Date avalability;

     //constructore
     public ContractorInfo() {
     }
     
    public ContractorInfo(String firstName, String lastName, String jobdescription, Date avalability) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobdescription = jobdescription;
        this.avalability = avalability;
    }
    

    //methode
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJobdescription() {
        return jobdescription;
    }

    public void setJobdescription(String jobdescription) {
        this.jobdescription = jobdescription;
    }

    public Date getAvailability() {
        return avalability;
    }

    public void setAvailability(Date avalability) {
        this.avalability = avalability;
    }
}
