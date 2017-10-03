package FactoryPatternSimple;

import org.junit.Test;

import static org.junit.Assert.*;

public class MessageFactoryTest {

    /*
     * Criamos 3 mensagens (1 de cada tipo) e enviamos a mensagem
     * para verifyMessage que irá confirmar que a mensagem corresponde
     * ao tipo solicitado.
     */
    @Test
    public void createEmailMessage() {

        Message emailMessage = new MessageFactory().construct(MessageType.EmailMessage);
        verifyMessage(emailMessage, Email.class);

        Message faxMessage = new MessageFactory().construct(MessageType.FaxMessage);
        verifyMessage(faxMessage, Fax.class);

        Message smsMessage = new MessageFactory().construct(MessageType.SMSMessage);
        verifyMessage(smsMessage, SMS.class);

    }

    /*
     * método que verifica se uma classe é do tipo pretendido
     */
    private void verifyMessage(Message message, Class<?> clazz) {
        assertTrue(clazz.getName(), clazz.isInstance(message));
        System.out.println("A mensagem pertence a Classe " + clazz.getName());
    }

}