package PrototypePattern;

public class AppDeep {

    public static void main(String[] args) {

        //Criamos o objecto Person com a referencia person1
        PersonDeep person1 = new PersonDeep("Luis", "Silva");

        //Adicionamos os pais de pessoa 1
        person1.setMothersName("Luisa Miranda Silva");
        person1.setFathersName("Joaquim Gomes Silva");

        System.out.println("- Person 1 tem o nome : " + person1.getFirstName() + " " + person1.getLastName());

        System.out.println("- Os pais de " + person1.getFirstName() + " " + person1.getLastName() + " são : " + person1.getMothersName() + " e " + person1.getFathersName());

        //Clonamos pessoa1 para pessoa2
        PersonDeep person2 = (PersonDeep) person1.clone();

        //Alteramos o primeiro e último nome em person2

        person2.setFirstName("Joaquina");
        person2.setLastName("Clonada");

        //Alteramos o nome da mãe e do pai em person2
        person2.setMothersName("Ermengarda Dos Santos");
        person2.setFathersName("Adalberto João Pires");

        //imprimimos para verificar
        System.out.println("- Person2 é um clone de person 1 e alteramos o nome para " + person2.getFirstName() + " " + person2.getLastName());
        System.out.println("- Alteramos o nome dos pais de Person2 para  : " + person2.getMothersName() + " e " + person2.getFathersName());

        System.out.println("- O nome dos pais de " + person1.getFirstName() + " " + person1.getLastName() + " mantém-se inalterado : " + person1.getMothersName() + " e " + person1.getFathersName());
        System.out.println("- O nome dos pais de " + person2.getFirstName() + " " + person2.getLastName() + " está correcto : " + person2.getMothersName() + " e " + person2.getFathersName());
        ;
        System.out.println("- O Objecto foi clonado no modo Deep");
    }
}
