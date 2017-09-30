package DecoratorPattern.ExampleTWO;

/**
 * O objecto mais simples. O que queremos decorar
 * em caso de necessidade
 */
public class StandardMessage implements Message {


    @Override
    public void sendMessage(String message) {
        System.out.println("Mensagem a enviar :");
        System.out.println(message + "\n");

    }
}
