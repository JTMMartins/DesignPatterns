package FactoryPattern;

public class App {

    public static void main(String[] args) {

        /**
         * Aqui pretendemos enviar um SMS
         * Uma vez que estamos a usar o enum MessageType para classificar os tipos de mensagem
         * definimos que queremos uma mensagem do tipo SMSMessage em type.
         * Definimos também o texto que pretendemos enviar na mensagem
         */
        MessageType type = MessageType.SMSMessage;
        String messageText = " O seu equipamento com o Numero 325 está pronto e pode vir recolhe-lo. Gratos pela preferencia.";

        /**
         * definimos messageSender como sendo do tipo Message (Do interface que agrupa os diversos tipos de mensagem)
         * e solicitamos que a fábrica construa um objecto que se enquadre no tipo de mensagem que pretendemos.
         * de seguida usamos o método sendMessage que pertence ao objeco que a fábrica nos devolveu.
         */
        Message messageSender = new MessageFactory().construct(type);
        messageSender.sendMessage(messageText);

        /**
         * Vamos apenas mudar o tipo para Email
         * e solicitar a fábrica que nos devolva um objecto do tipo Message
         * que nos permita enviar menssagens do tipo Email
         */

        type = MessageType.EmailMessage;
        messageSender = new MessageFactory().construct(type);
        messageSender.sendMessage(messageText);

        /**
         * identico ao anterior mas mudando o tipo para FaxMessage
         */

        type = MessageType.FaxMessage;
        messageSender = new MessageFactory().construct(type);
        messageSender.sendMessage(messageText);
    }
}
