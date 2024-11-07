package animal;

public class Classification {
    //field
    private String domain;
    private String kigdom;
    private String phylum;
    private String clada;
    private String classAmimal;

    //construct
    public Classification(){
        this.domain = "default domain";
        this.kigdom = "default kigdom ";
        this.clada = "default clayda";
        this.classAmimal = "default class";
        this.phylum = "default phylum";
    }
    public Classification(String domain, String kigdom ,String phylum, String clada, String classAmimal){
        this.domain = domain;
        this.kigdom = kigdom;
        this.phylum = phylum;
        this.clada = clada;
        this.classAmimal = classAmimal;
    }
    //methode = function = operations


    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getKigdom() {
        return kigdom;
    }

    public void setKigdom(String kigdom) {
        this.kigdom = kigdom;
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

    public String getClassAmimal() {
        return classAmimal;
    }

    public void setClassAmimal(String classAmimal) {
        this.classAmimal = classAmimal;
    }
}
