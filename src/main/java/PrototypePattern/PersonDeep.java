package PrototypePattern;

public class PersonDeep implements Cloneable {

    private String firstName;
    private String lastName;
    private Affiliation parents;

    public PersonDeep() {

        if (parents == null) {
            parents = new Affiliation();
        }
    }


    public PersonDeep(String firstName, String lastName) {
        this();//chamamos o construtor default para inicializar o objecto affiliation
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public PersonDeep clone() {
        try {
            PersonDeep personDeepClone = (PersonDeep) super.clone();
            personDeepClone.firstName = new String(); //Inicializamos o atributo firstName
            personDeepClone.lastName = new String(); //Inicializamos o atributo lastname
            personDeepClone.parents = new Affiliation(); // Inicializamos o atributo parents
            return personDeepClone; //retornamos a cópia com a mesma estrutura mas todos os atributos inicializados.
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
