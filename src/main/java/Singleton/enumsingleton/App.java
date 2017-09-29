package Singleton.enumsingleton;

/**
 * Exemplo de Utilizacao de Singletons baseados em Enum
 */
public class App {

    public static void main(String[] args) {

        /**
         * solicitamos uma instancia do nosso enumEagerSingleton e atribuimos a firstEnumSingleton
         */
        EnumEagerSingleton firstEnumSingleton = EnumEagerSingleton.INSTANCE;

        /**
         * Os métodos devem retornar algo. neste caso retorna um String
         */
        String firstEnumSingletonResponse = EnumEagerSingleton.INSTANCE.doSomeWork();

        /**
         * imprimimos a resposta recebida do método doSomeWork que existe no EnumEagerSingleton
         */
        System.out.println(firstEnumSingletonResponse + "\n");

        /**
         * imprimimos o hashcode do firstEnumSingleton
         */
        System.out.println("firstEnumSingleton HashCode = " + String.valueOf(firstEnumSingleton.hashCode()) + "\n");


        /**
         * solicitamos uma instancia do nosso enumEagerSingleton  e atribuimos a secondEnumSingleton
         */
        EnumEagerSingleton secondEnumSingleton = EnumEagerSingleton.INSTANCE;

        /**
         * Os métodos devem retornar algo. neste caso retorna um String
         */
        String secondEnumSingletonResponse = EnumEagerSingleton.INSTANCE.doSomeWork();
        /**
         * imprimimos a resposta recebida do método doSomeWork que existe no EnumEagerSingleton
         */
        System.out.println(secondEnumSingletonResponse + "\n");

        /**
         * imprimimos o hashcode do secondEnumSingleton
         */
        System.out.println("secondEnumSingleton HashCode = " + String.valueOf(secondEnumSingleton.hashCode()) + "\n");

        System.out.println("Como podemos ver o hashcode do objecto é igual, logo trata-se do mesmo objecto\n");

        /**
         * OS EXEMPLOS ACIMA SÃO MERAMENTE DEMONSTRATIVOS.
         * podemos utilizar uma unica linha
         */

        System.out.println(EnumEagerSingleton.INSTANCE.doSomeWork());


    }

}
