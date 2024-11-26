package org.solvd.zoo.contractor;

import org.solvd.zoo.interfacezoo.Clean;
import org.solvd.zoo.interfacezoo.Feed;
import org.solvd.zoo.interfacezoo.ScheduleVet;

//This class is a parent class and descript people who work in the zoo
public final class Employee implements Feed, Clean, ScheduleVet {
    //field
    private String firstName;
    private String lastName;
    private String role;
    Account account;
    private short pesel;
    //constructor
    public Employee() {
    }
    public Employee(String firstName, String lastName, String role, Account account, short pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.account = account;
        this.pesel = pesel;
    }

    public Employee(String firstName, String lastName , String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    //methode


    @Override
    public String toString() {
        return "Employee{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                ", role = '" + role + '\'' +
                ", account = " + account +
                ", pesel = " + pesel +
                '}';
    }
    @Override
    public void cleaning() {

    }

    @Override
    public void useUtilities() {

    }

    @Override
    public void feed() {

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public short getPesel() {
        return pesel;
    }

    public void setPesel(short pesel) {
        this.pesel = pesel;
    }


}
