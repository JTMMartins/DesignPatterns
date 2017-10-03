package FactoryMethodPattern;

public class App {

    public static void main(String[] args) {


        MessageFactory factory = new ElectronicMessageFactory();
        Message message1 = factory.construct("Este é o corpo do nosso email", MessageType.EmailMessage);
        /* Poderiamos, guardar a mensagem devolvida numa base de dados, para manter um registo de comunicacões da empresa.*/

        System.out.println("-------------------------");

        Message message2 = factory.construct("Este é o corpo do nosso SMS", MessageType.SMSMessage);

        System.out.println("-------------------------");

        /*
        * Podemos usar apenas uma linha para tratar da mensagem
        */
        Message message3 = new WrittenMessageFactory().construct("Este é o corpo do nosso FAX", MessageType.FaxMessage);

        System.out.println("-------------------------");

        MessageFactory factory1 = new WrittenMessageFactory();
        Message message4 = factory1.construct("Este é o corpo da nossa carta", MessageType.Letter);

    }


}
