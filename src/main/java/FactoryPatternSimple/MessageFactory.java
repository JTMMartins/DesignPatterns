package FactoryPatternSimple;

public class MessageFactory {

    public Message construct(MessageType type) {

        /**
         * Analisamos qual o tipo de mensagem que o cliente pretende enviar
         * e vamos devolver um objecto do tipo pretendido
         */
        switch (type) {

            case SMSMessage:

                return new SMS();

            case EmailMessage:

                return new Email();

            case FaxMessage:

                return new Fax();
        }
        throw new NullPointerException("Tipo de Mensagem inválido");
    }
}
