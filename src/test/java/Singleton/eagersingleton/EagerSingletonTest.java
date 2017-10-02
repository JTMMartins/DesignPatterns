package Singleton.eagersingleton;

import Singleton.lazysingleton.LazySingleton;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.function.Supplier;

import static org.junit.Assert.*;

public class EagerSingletonTest {


    /**
     * Testa que o Singleton é sempre o mesmo objecto
     */
    @Test
    public void testMultipleInstantiationReturnTheSameObject() throws Exception {
        /* create 4 instances of singleton */
        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();
        EagerSingleton es3 = EagerSingleton.getInstance();
        EagerSingleton es4 = EagerSingleton.getInstance();
        /* check they are the same */
        assertSame(es1, es2);
        assertSame(es2, es3);
        assertSame(es3, es4);
    }


    /**
     * MULTITHREAD - verificar que a instancia é sempre a mesma
     * ESTE.
     * COMO POR VEZES É DIFICIL DE DETECTAR PROBLEMAS EM AMBIENTE
     * MULTITHREAD CORREMOS 900 MIL VEZES.
     */
    @Test
    public void testMultithreadEagerSingletonInstantiation() {

        /* Prepara uma lista de Testers */
        List<Test1> testers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
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
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();

        if (lastHascode == null) {
            lastHascode = EagerSingleton.getInstance().hashCode();
        }
        thisHashCode = eagerSingleton.hashCode();
        //System.out.println("LAST : "+ lastHascode + " This : " + thisHashCode);
        //test previous HashCode with actualHashcode
        assertEquals(thisHashCode, lastHascode);
        lastHascode = thisHashCode;
    }


}