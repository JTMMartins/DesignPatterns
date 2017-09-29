package FactoryPattern;


/**
 * Fax class implementa o Interface Message
 * Agora Fax também é uma Message e terá de implementar
 * todos os métodos abstractos (sem corpo) definidos no Interface.
 */
public class Fax implements Message {


    /**
     * Desenvolvemos a nossa implementacao para que
     * seja possivel enviar mensagens via FAX.
     */
    @Override
    public void sendMessage(String message) {
        System.out.println("Estou a enviar um FAX com o texto: " + message);
    }
}
