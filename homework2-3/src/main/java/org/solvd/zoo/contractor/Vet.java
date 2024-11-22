package org.solvd.zoo.contractor;

import org.solvd.zoo.interfacezoo.ScheduleVet;

import java.util.Objects;

//Class that contain information about Vets that visit the zoo
public class Vet implements ScheduleVet {
    //fields
    private static int id;
    private String firstName;
    private String lastName;
    private Account account;
    private String clinicName;
    private String descriptionSpecialization;

    //constructor

    public Vet() {
    }

    public Vet(String firstName, String lastName, Account account, String clinicName, String descriptionSpecialization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.account = account;
        this.clinicName = clinicName;
        this.descriptionSpecialization = descriptionSpecialization;
    }


    //methode


    @Override
    public String toString() {
        return "Vet{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", clinicName='" + clinicName + '\'' +
                ", descriptionSpecialization='" + descriptionSpecialization + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vet vet = (Vet) o;
        return id == vet.id && Objects.equals(firstName, vet.firstName) && Objects.equals(lastName, vet.lastName) && Objects.equals(clinicName, vet.clinicName) && Objects.equals(descriptionSpecialization, vet.descriptionSpecialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, clinicName, descriptionSpecialization);
    }

    public void giveMedicine(){

    }
    @Override
    public void schedulVetApoitment() {

    }

    @Override
    public void reschedulVetAppoitment() {

    }

    @Override
    public void scheduleSeriesOfVetApoitment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getDescriptionSpecialization() {
        return descriptionSpecialization;
    }

    public void setDescriptionSpecialization(String descriptionSpecialization) {
        this.descriptionSpecialization = descriptionSpecialization;
    }

}
