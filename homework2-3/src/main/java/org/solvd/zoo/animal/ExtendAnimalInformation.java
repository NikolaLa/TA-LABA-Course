package org.solvd.zoo.animal;
import org.solvd.zoo.animal.subclass.animalenum.WaterType;
import org.solvd.zoo.contractor.Vet;

import java.util.Date;

public abstract class ExtendAnimalInformation {
    Vet assignetVet;
    private static Date birthday;
    private int howMany;
    private String measurment;
    private int ageMonth;
    WaterType waterType;
    private boolean isHealthy;

    public ExtendAnimalInformation() {
    }

    public ExtendAnimalInformation(Vet assignetVet, int howMany, String measurment, int ageMonth, WaterType waterType, boolean isHealthy) {
        this.assignetVet = assignetVet;
        this.howMany = howMany;
        this.measurment = measurment;
        this.ageMonth = ageMonth;
        this.waterType = waterType;
        this.isHealthy = isHealthy;
    }

    public Vet getAssignetVet() {
        return assignetVet;
    }

    public void setAssignetVet(Vet assignetVet) {
        this.assignetVet = assignetVet;
    }

    public static Date getBirthday() {
        return birthday;
    }

    public static void setBirthday(Date birthday) {
        ExtendAnimalInformation.birthday = birthday;
    }

    public int getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }

    public String getMeasurment() {
        return measurment;
    }

    public void setMeasurment(String measurment) {
        this.measurment = measurment;
    }

    public int getAgeMonth() {
        return ageMonth;
    }

    public void setAgeMOnth(int ageMonth) {
        this.ageMonth = ageMonth;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
}
