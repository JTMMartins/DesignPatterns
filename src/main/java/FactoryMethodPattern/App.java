package FactoryMethodPattern;

public class App {

    public static void main(String[] args) {

        MessageFactory factory = new ElectronicMessageFactory();
        Message message = factory.construct("Este é o corpo do nosso email", MessageType.EmailMessage);
    }


}
