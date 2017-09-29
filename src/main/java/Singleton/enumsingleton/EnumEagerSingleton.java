package Singleton.enumsingleton;

/**
 * Implementacao de Singleton baseado em Enum
 */
public enum EnumEagerSingleton {

    INSTANCE;

    public static String doSomeWork() {

        System.out.println("EnumLazySingleton is Doing SomeWork");

        return "EnumLazySingleton has finished Doing Work";

    }
}
