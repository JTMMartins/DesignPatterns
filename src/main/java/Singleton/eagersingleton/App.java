package Singleton.eagersingleton;

/**
 * Exemplo de Utilizacao de Singletons con instanciacao EAGER
 */
public class App {

    public static void main(String[] args) {

        /**
         * solicitamos uma instancia do nosso EagerSingleton e atribuimos a firstSingleton
         */
        EagerSingleton firstSingleton = EagerSingleton.getInstance();

        /**
         * solicitamos ao nosso firstSingleton para executar o método doSomeWork
         */
        firstSingleton.doSomeWork();

        /**
         * imprimimos o hashcode do FirstSingleton
         */
        System.out.println("firstSingleton HashCode = " + String.valueOf(firstSingleton.hashCode()) + "\n");

        /**
         * solicitamos uma instancia do nosso EagerSingleton e atribuimos a secondSingleton
         */
        EagerSingleton secondSingleton = EagerSingleton.getInstance();

        /**
         * solicitamos ao nosso secondSingleton para executar o método doSomeWork
         */
        secondSingleton.doSomeWork();

        /**
         * imprimimos o hashcode do secondSingleton
         */
        System.out.println("secondSingleton HashCode = " + String.valueOf(secondSingleton.hashCode()) + "\n");

        System.out.println("Como podemos ver o hashcode do objecto é igual, logo trata-se do mesmo objecto");


    }
}
