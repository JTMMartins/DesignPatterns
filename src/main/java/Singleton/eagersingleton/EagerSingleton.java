package Singleton.eagersingleton;


/**
 * Singleton class. Inicializacao static Eager. Garante-nos seguranca com threads
 */

public class EagerSingleton {

    /**
     * Static cria uma instancia da classe imediatamente
     */
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    /**
     * Construtor privado. Impede a instanciacao da classe via keyword new
     */
    private EagerSingleton() {
    }


    /**
     * este é o método chamado pelas classes que necessitem de aceder ao
     * Singleton.
     *
     * @return instancia of the Eagersingleton.
     */
    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    public void doSomeWork() {
        System.out.println("EagerSingleton está a realizar trabalho\n");
    }
}


