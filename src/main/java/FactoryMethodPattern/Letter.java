package FactoryMethodPattern;

/*
 * extende a classe abstracta Message.
 * Uma vez que extende uma classe abstracta com métodos
 * abstractos terá de implementar as funcionalidades para todos os métodos
 * da classe mãe.
 * Os métodos serão implementados com as funcionalidades pretendidas
 * para o envio de cartas.
 */
public class Letter extends Message {

    private String letterHeaderMessage;
    private String letterSignature;


    @Override
    public void prepareHeader() {

        letterHeaderMessage = "Este é o cabecalho usado em cartas";

    }

    @Override
    public void signMessage() {

        letterSignature = "Assinado pelo enviador de cartas";

    }

    @Override
    public void sendMessage() {

        String finalMessage = letterHeaderMessage + "\n" + messageBody + "\n" + letterSignature;
        System.out.println(finalMessage);

    }


}
