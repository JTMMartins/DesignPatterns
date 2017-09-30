package DecoratorPattern.ExampleTWO;

/**
 * EncriptedMessage extende MessageDecorator,
 * podendo aceder aos métodos da sua classe superior.
 */
public class EncriptedMessage extends MessageDecorator {


    public EncriptedMessage(Message message) {
        super(message);
    }

    /**
     * Aqui fazemos um override do método
     * pois queremos a nossa própria implementacão
     * para dar um tratamento diferente a mensagem.
     * Neste caso vamos envia-la para Enigma
     * que nos devolverá a mensagem codificada em B64.
     */
    @Override
    public void sendMessage(String message) {
        Enigma enigma = new Enigma();
        String enigmatedMessage = enigma.B64Encode(message);
        this.getDecoratedMessage().sendMessage(enigmatedMessage);
    }


}
