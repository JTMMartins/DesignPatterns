package DecoratorPattern.ExampleTWO;

import java.util.Base64;

/**
 * Classe de auxilio cujo objectivo é apenas
 * dar o tratamento pretendido a mensagem
 */
public class Enigma {


    /**
     * Codifica a mensagem em base64
     */
    public String B64Encode(String messageToEncrypt) {

        byte[] bytesEncoded = Base64.getEncoder().encode(messageToEncrypt.getBytes());
        return new String(bytesEncoded);
    }

    /**
     * Inverte a String de entrada
     * abc -> cba
     */
    public String reverser(String messageToReverse) {
        return new StringBuilder(messageToReverse).reverse().toString();
    }
}

