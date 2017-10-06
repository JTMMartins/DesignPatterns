package PrototypePattern;

public class Affiliation {

    private String mothersName;
    private String fathersName;

    public Affiliation() {

    }


    public Affiliation(String mothersName, String fathersName) {
        this.mothersName = mothersName;
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }
}
