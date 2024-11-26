package org.solvd.zoo.contractor;

import org.solvd.zoo.interfacezoo.Clean;
import org.solvd.zoo.interfacezoo.ScheduleVacation;

import java.util.Date;
import java.util.Objects;

public abstract class ContractorInfo implements Clean, ScheduleVacation {
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

    @Override
    public String toString() {
        return "ContractorInfo{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", jobdescription = '" + jobdescription + '\'' +
                ", avalability = " + avalability +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ContractorInfo that)) return false;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(jobdescription, that.jobdescription) && Objects.equals(avalability, that.avalability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, jobdescription, avalability);
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
