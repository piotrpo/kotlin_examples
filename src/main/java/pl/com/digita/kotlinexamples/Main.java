package pl.com.digita.kotlinexamples;

import pl.com.digita.kotlinexamples.telescope.KPerson;
import pl.com.digita.kotlinexamples.telescope.Person;

public class Main
{
    public static void main(String[] args)
    {
//        long nanoTime = System.nanoTime();
//        long iterations = (long)10E9;
//
//        System.out.println("Start java part");
//        for(int i = 0; i < iterations; i++){
//            new Person("John", "Java");
//        }
//
//        double javaTime = (System.nanoTime() - nanoTime) / 1E9;
//        System.out.println("Java finished in " + javaTime);
//
//        nanoTime = System.nanoTime();
//        System.out.println("Start Kotlin part");
//
//        for(int i = 0; i < iterations; i++){
//            new KPerson("Kylie", "Kotlin");
//        }
//
//        double kotlinTime = (System.nanoTime() - nanoTime) / 1E9;
//        System.out.println("Kotlin finished in " + kotlinTime);
//
//        System.out.println("Java - kotlin = " + (javaTime - kotlinTime));
        threads();
    }


    static void threads(){


        Thread myThread = new Thread()
        {
            @Override
            public void run()
            {
                System.out.println("Thread is working");
            }
        };

        myThread.start();



        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Thread is processing Runnable");
            }
        };

        new Thread(runnable).start();
    }

    public static boolean primeTest(int x){
        if(x == 2){
            return true;
        }

        if (x == 1 || x % 2 == 0)
        {
            return false;
        }

        int limit = (int)Math.sqrt(x);
        for(int i = 3; i <= limit; i = i + 2 ){
            if (x % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
