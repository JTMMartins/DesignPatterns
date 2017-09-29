package Singleton.lazysingleton;

/**
 * Exemplo de Utilizacao de Singletons com instanciacao LAZY
 */
public class App {

    public static void main(String[] args) {
        /**
         * solicitamos uma instancia do nosso LazySingleton e atribuimos a firstLazySingleton
         */
        LazySingleton firstLazySingleton = LazySingleton.getInstance();

        /**
         * solicitamos ao nosso firstLazySingleton para executar o método doSomeWork
         */
        firstLazySingleton.doSomeWork();

        /**
         * imprimimos o hashcode do firstLazySingleton
         */
        System.out.println("firstLazySingleton HashCode = " + String.valueOf(firstLazySingleton.hashCode()) + "\n");

        /**
         * solicitamos uma instancia do nosso LazySingleton e atribuimos a secondLazySingleton
         */
        LazySingleton secondLazySingleton = LazySingleton.getInstance();

        /**
         * solicitamos ao nosso secondLazySingleton para executar o método doSomeWork
         */
        secondLazySingleton.doSomeWork();

        /**
         * imprimimos o hashcode do secondLazySingleton
         */
        System.out.println("secondLazySingleton HashCode = " + String.valueOf(secondLazySingleton.hashCode()) + "\n");

        System.out.println("Como podemos ver o hashcode do objecto é igual, logo trata-se do mesmo objecto\n");
    }
}
