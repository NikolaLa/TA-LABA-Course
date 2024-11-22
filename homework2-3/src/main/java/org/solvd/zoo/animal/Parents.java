package org.solvd.zoo.animal;

import org.solvd.zoo.contractor.Vet;

import java.util.Date;

public abstract class Parents {
    //field
    //Vet vet; // optional part of Vet class

    private int ageMonth;
    private Date birthday;
    private String femaleName;
    private String femaleWhichZoo;
    private String maleName;
    private String maleWhichZoo;

    //Constructor
    public Parents()
    {
        this.ageMonth = 0;
        this.femaleName = "uknown";
        this.maleName ="uknown";
    }
    public Parents(int ageMonth, Date birthday){
        this.ageMonth = ageMonth;
        this.birthday = birthday;
    }

    public Parents(int ageMonth, Date birthday, String femaleName, String femaleWhichZoo, String maleName, String maleWhichZoo) {
        this.ageMonth = ageMonth;
        this.birthday = birthday;
        this.femaleName = femaleName;
        this.femaleWhichZoo = femaleWhichZoo;
        this.maleName = maleName;
        this.maleWhichZoo = maleWhichZoo;
    }

    @Override
    public String toString() {
        return "Parents{" +
                "ageMonth=" + ageMonth +
                ", birthday=" + birthday +
                ", femaleName='" + femaleName + '\'' +
                ", femaleWhichZoo='" + femaleWhichZoo + '\'' +
                ", maleName='" + maleName + '\'' +
                ", maleWhichZoo='" + maleWhichZoo + '\'' +
                '}';
    }

    //Methode
    public int convertMonthtoYear(int ageMonth){
        this.ageMonth = ageMonth/12;
        return ageMonth;
    }

    public int getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMonth(int ageMonth) {
        this.ageMonth = ageMonth;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFemaleName() {
        return femaleName;
    }

    public void setFemaleName(String femaleName) {
        this.femaleName = femaleName;
    }

    public String getFemaleWhichZoo() {
        return femaleWhichZoo;
    }

    public void setFemaleWhichZoo(String femaleWhichZoo) {
        this.femaleWhichZoo = femaleWhichZoo;
    }

    public String getMaleName() {
        return maleName;
    }

    public void setMaleName(String maleName) {
        this.maleName = maleName;
    }

    public String getMaleWhichZoo() {
        return maleWhichZoo;
    }

    public void setMaleWhichZoo(String maleWhichZoo) {
        this.maleWhichZoo = maleWhichZoo;
    }
}
