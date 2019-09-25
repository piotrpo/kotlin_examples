package pl.com.sandbox.kotlinexamples.singleton

import java.util.concurrent.atomic.AtomicInteger

object GlobalCounter{
    private var counter = AtomicInteger()
    fun next(): Int {
        return counter.incrementAndGet()
    }
}