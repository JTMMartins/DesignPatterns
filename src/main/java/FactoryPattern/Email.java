package FactoryPattern;


/**
 * Email class implementa o Interface Message
 * Agora Email também é uma Message e terá de implementar
 * todos os métodos abstractos (sem corpo) definidos no Interface.
 */
public class Email implements Message {

    /**
     * Desenvolvemos a nossa implementacao para que
     * seja possivel enviar mensagens via EMAIL.
     */
    @Override
    public void sendMessage(String message) {

        System.out.println("Estou a enviar um EMAIL com o texto : " + message);
    }
}
