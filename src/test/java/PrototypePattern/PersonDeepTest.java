package PrototypePattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonDeepTest {

    /*Garante-nos que o objecto Person e personClone não é o mesmo */
    @Test
    public void testEnsureDifferentMainObjects() {

        PersonDeep person1 = new PersonDeep("Primeiro Nome Pessoa 1", "Ultimo nome pessoa 1");

        PersonDeep person2 = person1.clone();

        assertNotSame(person1, person2);
    }

    /* Ao passar, este teste demonstra que o objecto interior Affiliation
     * NÃO É O MESMO que o seu clone
     */
    @Test
    public void testSameInnerObjects() {

        PersonDeep person1 = new PersonDeep("Primeiro Nome Pessoa 1", "Ultimo nome pessoa 1");
        person1.setMothersName("Luisa Miranda Silva");
        person1.setFathersName("Joaquim Gomes Silva");

        PersonDeep person2 = person1.clone();

        assertNotSame(person2.getFirstName(), person1.getFirstName());
        assertNotSame(person2.getLastName(), person1.getLastName());
        assertNotSame(person2.getParents(), person1.getParents());
    }

}