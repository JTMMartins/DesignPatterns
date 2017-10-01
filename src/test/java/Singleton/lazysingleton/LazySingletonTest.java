package Singleton.lazysingleton;

import Singleton.eagersingleton.EagerSingleton;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LazySingletonTest {

    /**
     * TESTAR QUE O SINGLETON É SEMPRE O MESMO OBJECTO (SINGLE THREAD)
     */
    @Test
    public void testMultipleInstantiationReturnTheSameObject() throws Exception {
        /* create 4 instances of singleton */
        LazySingleton ls1 = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();
        LazySingleton ls3 = LazySingleton.getInstance();
        LazySingleton ls4 = LazySingleton.getInstance();
        /* check they are the same */
        assertSame(ls1, ls2);
        assertSame(ls2, ls3);
        assertSame(ls3, ls4);
    }


    /**
     * MULTITHREAD - verificar que a instancia é sempre a mesma
     * ESTE TESTE VAI OCASIONALMENTE FALHAR.
     * ESSE COMPORTAMENTO É MAIS FÁCILMENTE DETECTADO SE
     * COMENTARMOS A LINHA 75 (PRINT).
     * PRESUMO QUE AO RETIRARMOS O PRINT, UMA VEZ QUE O
     * SISTEMA É IMEDIATAMENTE MAIS RÁPIDO, A CHANCE DE
     * OCORREREM CONCORRENCIA DE THREADS AUMENTA, LOGO
     * POR VEZES A INSTANCIA NÃO É A MESMA.
     * ISTO DEMONSTRA QUE A INSTANCIACÃO LAZY NÃO É
     * THREAD SAFE.
     * <p>
     * Estas situacões são dificeis de detectar, sendo
     * por isso que se cria uma lista com 900 mil testers
     * e mesmo assim por vezes o teste passa.
     */
    @Test
    public void testMultithreadLazySingletonInstantiation() {

        /* Prepara uma lista de Testers */
        List<Test1> testers = new ArrayList<>();
        for (int i = 0; i < 900000; i++) {
            testers.add(new Test1());
        }

        /* prepara uma lista de threads */
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < testers.size(); i++) {
            threads.add(new Thread(testers.get(i)));
        }

        /* Lanca as threads */
        for (int i = 0; i < threads.size(); i++) {
            Thread thread = threads.get(i);
            thread.start();
        }

    }

}

/*Classe auxiliar para iniciar as threads.*/
final class Test1 implements Runnable {
    private static Integer lastHascode;
    private Integer thisHashCode;

    @Override
    public void run() {
        thisHashCode = 0;
        /* cria algumas instancias e testa. */
        LazySingleton lazySingleton = LazySingleton.getInstance();
        if (lastHascode == null) {
            lastHascode = lazySingleton.hashCode();
        }
        thisHashCode = lazySingleton.hashCode();
        //System.out.println("LAST : "+ lastHascode + " This : " + thisHashCode);
        assertEquals(thisHashCode, lastHascode);
        lastHascode = thisHashCode;
    }
}

