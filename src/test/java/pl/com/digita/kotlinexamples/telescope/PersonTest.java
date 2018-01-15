package pl.com.digita.kotlinexamples.telescope;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest
{
    @Test
    public void instantiateTest(){
        new Person("John", "Smith");
        new Person("John", "Smith", 42);
        new Person("John", "Smith", 42, 2);
        new Person("John", "Smith", null, 2);


        new KPerson("John", "Smith");
        new KPerson("John", "Smith", 42);
        new KPerson("John", "Smith", 42, 2);
        new KPerson("John", "Smith", null, 2);
    }
}