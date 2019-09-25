package pl.com.sandbox.kotlinexamples;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest
{

    @Test
    public void primeTest()
    {
        assertTrue(Main.primeTest(2));
        assertTrue(Main.primeTest(3));
        assertTrue(Main.primeTest(5));
        assertTrue(Main.primeTest(7));
        assertTrue(Main.primeTest(11));


        assertFalse(Main.primeTest(4));
        assertFalse(Main.primeTest(9));
        assertFalse(Main.primeTest(15));
        assertFalse(Main.primeTest(21));
    }
}