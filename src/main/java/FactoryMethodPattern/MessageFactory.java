package FactoryMethodPattern;


/*
 * Aqui a factory vai definir o tipo de operacoes comum a todas as
 * mensagens.
 * NOTA : é definido um método abstracto constructMessage que terá de ser
 * implementado pelas classes que herdarem desta que são as duas
 * "sub fábricas especializadas. (electronicMessageFactory e WrittenMessageFactory)
 */
public abstract class MessageFactory {

    public abstract Message constructMessage(String messageToSend, MessageType type);


    public Message construct(String messageToSend, MessageType type) {

        Message message = constructMessage(messageToSend, type);

        message.prepareHeader();
        message.signMessage();
        message.sendMessage();
        return message;

    }
}
