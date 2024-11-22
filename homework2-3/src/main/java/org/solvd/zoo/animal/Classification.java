package org.solvd.zoo.animal;

import java.util.*;

public abstract class Classification{
    //field
    protected final String domain = "Eukarya";
    protected final String kigdom = "Animalia";
    protected String phylum;
    protected String clada;
    protected String classAnimal;

    //construct

    public Classification() {
    }

    public Classification(String domain, String phylum, String clada, String classAnimal) {
        this.phylum = phylum;
        this.clada = clada;
        this.classAnimal = classAnimal;
    }

//methode = function = operations


    public String getDomain() {
        return domain;
    }


    public String getKigdom() {
        return kigdom;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getClada() {
        return clada;
    }

    public void setClada(String clada) {
        this.clada = clada;
    }

    public String getClassAnimal() {
        return classAnimal;
    }

    public void setClassAnimal(String classAnimal) {
        this.classAnimal = classAnimal;
    }

    @Override
    public String toString() {
        return "Classification{" +
                "domain='" + domain + '\'' +
                ", kigdom='" + kigdom + '\'' +
                ", phylum='" + phylum + '\'' +
                ", clada='" + clada + '\'' +
                ", classAnimal='" + classAnimal + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classification that = (Classification) o;
        return Objects.equals(domain, that.domain) && Objects.equals(kigdom, that.kigdom) && Objects.equals(phylum, that.phylum) && Objects.equals(clada, that.clada) && Objects.equals(classAnimal, that.classAnimal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, kigdom, phylum, clada, classAnimal);
    }
}
