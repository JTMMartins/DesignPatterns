package FactoryMethodPattern;


/**
 * Esta é uma classe especializada que apenas consegue enviar
 * mensagens do tipo escrito em papel (FAX e Cartas)
 */
public class WrittenMessageFactory extends MessageFactory {

    @Override
    public Message constructMessage(String messageToSend, MessageType type) {

        Message message = null;

        switch (type) {

            case FaxMessage:
                message = new FAX();
                message.setMessageBody(messageToSend);

            case Letter:
                message = new Letter();
                message.setMessageBody(messageToSend);

        }

        return message;
    }
}
