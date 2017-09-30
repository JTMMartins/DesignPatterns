package DecoratorPattern.ExampleTWO;


/**
 * O interface que vai agregar o objecto mais simples (o que queremos decorar)
 * com o decorador.
 * Depois de implementado em ambos, o cliente não saberá se está a lidar com uma
 * mensagem Standard ou com uma mensagem decorada. Estará sempre a lidar com o tipo
 * Message
 */
public interface Message {

    void sendMessage(String message);


}
