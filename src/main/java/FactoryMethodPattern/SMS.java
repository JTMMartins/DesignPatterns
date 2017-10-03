package FactoryMethodPattern;

/**
 * extende a classe abstracta Message.
 * Uma vez que extende uma classe abstracta com mëtodos
 * abstractos terá de implementar as funcionalidades para todos os métodos
 * da classe mãe.
 * Os métodos serão implementados com as funcionalidades pretendidas
 * para o envio de SMS.
 */
public class SMS extends Message {

    private String smsHeaderMessage;
    private String smsSignature;

    @Override
    public void prepareHeader() {
        smsHeaderMessage = "Cabecalho usado em SMS";


    }

    @Override
    public void signMessage() {
        smsSignature = "assinado pelo enviador de SMS";

    }

    @Override
    public void sendMessage() {

        String finalMessage = smsHeaderMessage + "\n" + messageBody + "\n" + smsSignature;
        System.out.println(finalMessage);

    }
}
