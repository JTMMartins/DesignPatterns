package Singleton.eagersingleton;

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
     * Test the singleton is always the same Object
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


    @Test
    public void launchThreads() {

        /* Prepara uma lista de Testers */
        List<Test1> testers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
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
    private static Integer thisHashCode;

    @Override
    public void run() {
        /* cria algumas instancias e testa. */
        for (int i = 0; i < 5; i++) {
            if (lastHascode == null) {
                lastHascode = EagerSingleton.getInstance().hashCode();
            }
            thisHashCode = EagerSingleton.getInstance().hashCode();
            //test previous HashCode with actualHashcode
            assertEquals(thisHashCode, lastHascode);
            lastHascode = thisHashCode;
            System.out.println(Thread.currentThread().getName() + " = " + EagerSingleton.getInstance().hashCode());
        }
    }

}