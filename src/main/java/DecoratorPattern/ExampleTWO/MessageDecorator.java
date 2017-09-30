package DecoratorPattern.ExampleTWO;


/**
 * O decorador base, a partir do qual todos os outros irão derivar.
 * implementa também o interface Message, logo passa a poder ser
 * referenciado com uma Message.
 */
public abstract class MessageDecorator implements Message {

    /**
     * utilizamos o modificador protected, para que
     * decoratedMessage fique apenas disponível para
     * o package e para as subclasses
     */
    protected Message decoratedMessage;


    public MessageDecorator(Message message) {
        this.decoratedMessage = message;
    }

    /**
     * Não precisamos de corpo para o método.
     */
    public abstract void sendMessage(String message);


    public Message getDecoratedMessage() {
        return this.decoratedMessage;
    }


}
