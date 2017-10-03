package FactoryPatternSimple;


/**
 * SMS class implementa o Interface Message
 * Agora SMS também é uma Message e terá de implementar
 * todos os métodos abstractos (sem corpo) definidos no Interface.
 */
public class SMS implements Message {


    /**
     * Desenvolvemos a nossa implementacao para que
     * seja possivel enviar mensagens via SMS.
     */
    @Override
    public void sendMessage(String message) {
        System.out.println("Estou a enviar um SMS com o texto : " + message);
    }
}
