package FactoryMethodPattern;


/*
 * Classe abstracta que vai definir quais os métodos que as classes
 * "filhas" terão de implementar.
 */
public abstract class Message {

    public String messageBody;


    public void setMessageBody(String body) {

        this.messageBody = body;
    }

    public abstract void prepareHeader();

    public abstract void signMessage();

    public abstract void sendMessage();

}
