package PrototypePattern;


import org.junit.Test;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class PersonTest {

    /*Garante-nos que o objecto Person e personClone não é o mesmo */
    @Test
    public void testEnsureDifferentMainObjects() {

        Person person1 = new Person("Primeiro Nome Pessoa 1", "Ultimo nome pessoa 1");

        Person person2 = person1.clone();

        assertNotSame(person1, person2);
    }

    /* Ao passar, este teste demonstra que o objecto interior Affiliation
    * é o mesmo em person1 e no seu clone.
     */
    @Test
    public void testSameInnerObjects() {

        Person person1 = new Person("Primeiro Nome Pessoa 1", "Ultimo nome pessoa 1");
        person1.setMothersName("Luisa Miranda Silva");
        person1.setFathersName("Joaquim Gomes Silva");

        Person person2 = person1.clone();

        assertSame(person2.getFirstName(), person1.getFirstName());
        assertSame(person2.getLastName(), person1.getLastName());
        assertSame(person2.getParents(), person1.getParents());
    }
}