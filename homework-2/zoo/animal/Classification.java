package animal;

import java.util.*;

public class Classification {
    //field
    protected Set domain = new HashSet<>();
    protected Set kigdom = new HashSet<>();
    protected List phylum;
    protected List clada;
    protected List classAnimal;

    //construct

    public Classification() {
    }

    public Classification(Set domain, Set kigdom, List phylum, List clada, List classAnimal) {
        this.domain = domain;
        this.kigdom = kigdom;
        this.phylum = phylum;
        this.clada = clada;
        this.classAnimal = classAnimal;
    }

    //methode = function = operations


    public Set getDomain() {
        return domain;
    }

    public void setDomain(Set domain) {
        this.domain = domain;
    }

    public Set getKigdom() {
        return kigdom;
    }

    public void setKigdom(Set kigdom) {
        this.kigdom = kigdom;
    }

    public List getPhylum() {
        return phylum;
    }

    public void setPhylum(List phylum) {
        this.phylum = phylum;
    }

    public List getClada() {
        return clada;
    }

    public void setClada(List clada) {
        this.clada = clada;
    }

    public List getClassAnimal() {
        return classAnimal;
    }

    public void setClassAnimal(List classAnimal) {
        this.classAnimal = classAnimal;
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
