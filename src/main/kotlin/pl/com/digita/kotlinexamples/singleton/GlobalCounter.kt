package pl.com.digita.kotlinexamples.singleton

object GlobalCounter{
    private var counter = 0
    fun next(): Int {
        return ++counter
    }
}