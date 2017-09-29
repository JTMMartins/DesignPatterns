package Singleton.lazysingleton;

public class LazySingleton {

    /**
     * defenimos apenas um apontador estatico de nome instance do tipo LazySingleton, mas não criamos nenhuma instancia
     */
    private static LazySingleton instance;

    /**
     * Construtor privado. Impede a instanciacao da classe via keyword new
     */
    private LazySingleton() {
    }

    /**
     * este é o método chamado pelas classes que necessitem de aceder ao
     * Singleton.
     *
     * @return instancia do LazySingleton
     */
    public static LazySingleton getInstance() {

        if (instance == null) { //Verifica se instance já se encontra inicializado
            instance = new LazySingleton();//Se não estiver cria uma nova instancia
        }
        return instance;//devolve a instancia do LazySingleton
    }

    public void doSomeWork() {
        System.out.println("Lazy Singleton is Working\n");
    }
}
