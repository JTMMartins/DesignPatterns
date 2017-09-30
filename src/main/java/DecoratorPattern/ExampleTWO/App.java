package DecoratorPattern.ExampleTWO;

public class App {

    public static void main(String[] args) {


        String messageToSend = "Esta é uma mensagem importantissima sobre Decorator Pattern";

        /**
         * Pretendemos enviar uma mensagem Simples.
         * como tal, instanciamos StandardMessage
         * e procedemos ao seu envio.
         */
        Message message = new StandardMessage();
        message.sendMessage(messageToSend);

        /**
         * Pretendemos enviar uma mensagem Codificada em Base64
         * então instanciamos EncriptedMessage e como parametro
         * enviamos uma instancia de StandardMessage
         */
        Message encodedMessage = new EncriptedMessage(new StandardMessage());
        encodedMessage.sendMessage(messageToSend);


        /**
         * Pretendemos enviar uma mensagem invertida
         * então instanciamos ReversedMessage e como parametro
         * enviamos uma instancia de StandardMessage
         */
        Message reversedMessage = new ReversedMessage(new StandardMessage());
        reversedMessage.sendMessage(messageToSend);

        /**
         * Pretendemos enviar uma mensagem CODIFICADA E INVERTIDA
         * (a mensagem primeiro é codificada e depois de codificada é invertida)
         * então vamos encadear decoradores para adicionar funcionalidades
         * Instanciamos EncriptedMessage, como parametro enviamos ReversedMessage
         * e o parametro desta será StandardMessage
         */
        Message encodedAndReversedMessage = new EncriptedMessage(new ReversedMessage(new StandardMessage()));
        encodedAndReversedMessage.sendMessage(messageToSend);

        /**
         * Pretendemos enviar uma mensagem INVERTIDA E CODIFICADA
         * (a mensagem primeiro é invertida e depois a mensagem invertida é codificada)
         * tal como em cima vamos encadear decoradores para adicionar funcionalidades
         * Instanciamos ReversedMessage, como parametro enviamos EncriptedMessage
         * e o parametro desta será StandardMessage
         */
        Message reversedAndEncoded = new ReversedMessage(new EncriptedMessage(new StandardMessage()));
        reversedAndEncoded.sendMessage(messageToSend);

        /**
         * O que acontece se invertermos a mensagem e a voltarmos a inverter novamente ?
         * deveremos receber a mensagem original..Vamos verificar
         */
        Message doubleReversed = new ReversedMessage(new ReversedMessage(new StandardMessage()));
        doubleReversed.sendMessage(messageToSend);


    }
}
