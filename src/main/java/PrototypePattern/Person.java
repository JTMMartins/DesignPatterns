package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

/*
* Classe que simula um conjunto de empregados, obtidos a partir de uma base de dados
 */
public class Person implements Cloneable {

    private String firstName;
    private String lastName;
    private Affiliation parents;

    public Person() {

        if (parents == null) {
            parents = new Affiliation();
        }
    }

    public Person(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMothersName() {
        return parents.getMothersName();
    }

    public String getFathersName() {
        return parents.getFathersName();
    }

    public void setMothersName(String mothersName) {
        parents.setMothersName(mothersName);
    }

    public void setFathersName(String fathersName) {
        parents.setFathersName(fathersName);
    }

    public Affiliation getParents() {
        return parents;
    }


}
