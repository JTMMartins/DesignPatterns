package Singleton.enumsingleton;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class EnumEagerSingletonTest {

    /**
     * Testa que o Singleton é sempre o mesmo objecto
     */
    @Test
    public void testMultipleInstantiationReturnTheSameObject() throws Exception {
        /* create 4 instances of singleton */
        EnumEagerSingleton enum1 = EnumEagerSingleton.INSTANCE;
        EnumEagerSingleton enum2 = EnumEagerSingleton.INSTANCE;
        EnumEagerSingleton enum3 = EnumEagerSingleton.INSTANCE;
        EnumEagerSingleton enum4 = EnumEagerSingleton.INSTANCE;
        /* check they are the same */
        assertSame(enum1, enum2);
        assertSame(enum2, enum3);
        assertSame(enum3, enum4);
    }


}