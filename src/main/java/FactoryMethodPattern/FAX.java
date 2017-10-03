package FactoryMethodPattern;

/**
 * extende a classe abstracta Message.
 * Uma vez que extende uma classe abstracta com métodos
 * abstractos terá de implementar as funcionalidades para todos os métodos
 * da classe mãe.
 * Os métodos serão implementados com as funcionalidades pretendidas
 * para o envio de FAX.
 */
public class FAX extends Message {

    private String faxHeaderMessage;
    private String faxSignature;

    @Override
    public void prepareHeader() {

        faxHeaderMessage = " Este é o cabecalho usado em emails";
    }

    @Override
    public void signMessage() {
        faxSignature = "Assinado pelo enviador de faxes";

    }

    @Override
    public void sendMessage() {
        String finalMessage = faxHeaderMessage + "\n" + messageBody + "\n" + faxSignature;
        System.out.println(finalMessage);

    }
}
