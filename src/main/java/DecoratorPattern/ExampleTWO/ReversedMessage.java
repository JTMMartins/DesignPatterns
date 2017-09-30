package DecoratorPattern.ExampleTWO;

/**
 * ReversedMesssage extende MessageDecorator,
 * podendo aceder aos métodos da sua classe superior.
 */
public class ReversedMessage extends MessageDecorator {

    public ReversedMessage(Message message) {
        super(message);
    }

    /**
     * Aqui fazemos um override do método
     * pois queremos a nossa própria implementacão
     * para dar um tratamento diferente a mensagem.
     * Neste caso vamos envia-la para Enigma
     * que nos devolverá a mensagem invertida.
     */
    @Override
    public void sendMessage(String message) {
        Enigma enigma = new Enigma();
        String reversedMessage = enigma.reverser(message);
        this.getDecoratedMessage().sendMessage(reversedMessage);

    }
}
