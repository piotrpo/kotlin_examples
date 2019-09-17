package pl.com.digita.kotlinexamples

import pl.com.digita.kotlinexamples.telescope.KPerson
import pl.com.digita.kotlinexamples.telescope.Person

class KMain {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var nanoTime = System.nanoTime()
            val iterations = 10E9.toLong()

            println("Start java part")
            for (i in 0..iterations) {
                Person("John", "Java")
            }

            val javaTime = (System.nanoTime() - nanoTime) / 1E9
            println("Java finished in " + javaTime)

            nanoTime = System.nanoTime()
            println("Start Kotlin part")

            for (i in 0..iterations) {
                KPerson("Kylie", "Kotlin")
            }

            val kotlinTime = (System.nanoTime() - nanoTime) / 1E9
            println("Kotlin finished in " + kotlinTime)

            println("Java - kotlin = " + (javaTime - kotlinTime))
        }
    }
}