package FactoryMethodPattern;


/*
 * Esta é uma classe especializada que apenas consegue enviar
 * mensagens do tipo electrónio (Emails e SMS)
 */
public class ElectronicMessageFactory extends MessageFactory {

    @Override
    public Message constructMessage(String messageToSend, MessageType type) {

        Message message = null;

        switch (type) {

            case EmailMessage:

                message = new Email();
                message.setMessageBody(messageToSend);
                break;

            case SMSMessage:

                message = new SMS();
                message.setMessageBody(messageToSend);
                break;
        }

        return message;
    }
}
