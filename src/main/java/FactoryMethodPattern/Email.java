package FactoryMethodPattern;

/*
 * extende a classe abstracta Message.
 * Uma vez que extende uma classe abstracta com métodos
 * abstractos terá de implementar as funcionalidades para todos os métodos
 * da classe mãe.
 * Os métodos serão implementados com as funcionalidades pretendidas
 * para o envio de emails.
 */
public class Email extends Message {

    private String emailHeaderMessage;
    private String emailSignature;

    @Override
    public void prepareHeader() {

        emailHeaderMessage = "Este é o cabecalho usado em Emails";
    }

    @Override
    public void signMessage() {
        emailSignature = "Assinado pelo enviador de emails";

    }

    /**
     * aqui iremos definir as formas de envio para o nosso email
     * eventualmente chamando uma classe que envie emails.
     */
    @Override
    public void sendMessage() {
        String finalMessage = emailHeaderMessage + "\n" + messageBody + "\n" + emailSignature;
        System.out.println(finalMessage);

    }
}
