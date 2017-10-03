package FactoryMethodPattern;

import org.junit.Test;

import static org.junit.Assert.*;


public class MessageFactoryMethodTest {

    /*
    Criamos uma mensagem de cada tipo e enviamos para verificacão.
    */
    @Test
    public void createMessage() {
        Message message1 = new WrittenMessageFactory().construct("testando um FAX", MessageType.FaxMessage);
        verifyMessage(message1, FAX.class);

        Message message2 = new WrittenMessageFactory().construct("testando uma carta", MessageType.Letter);
        verifyMessage(message2, Letter.class);

        Message message3 = new ElectronicMessageFactory().construct("Testando um Email", MessageType.EmailMessage);
        verifyMessage(message3, Email.class);

        Message message4 = new ElectronicMessageFactory().construct("Testando um SMS", MessageType.SMSMessage);
        verifyMessage(message4, SMS.class);
    }

    /*
 * método que verifica se uma classe é do tipo pretendido
 */
    private void verifyMessage(Message message, Class<?> clazz) {
        assertTrue(clazz.getName(), clazz.isInstance(message));
        System.out.println("A mensagem pertence a Classe " + clazz.getName());
    }

}