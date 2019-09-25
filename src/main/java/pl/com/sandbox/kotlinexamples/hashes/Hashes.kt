package pl.com.sandbox.kotlinexamples.hashes

fun main(args: Array<String>) {
    println("Starting ...")

    val operationStart = System.nanoTime()

    val map = HashMap<Key, String>()
    val value = "Some string"
    val epoch = 1E4.toInt()

    var epochStart = operationStart

    (1..1E5.toInt()).forEach {
        map.put(Key(it), value)
        if ((it % epoch) == 0) {
            val nanoTime = System.nanoTime()
            println("Inserted ${it} ${duration(epochStart, nanoTime)}")
            epochStart = nanoTime
        }
    }

    val insertionEndTime = System.nanoTime()

    println("Insertion Time [s]: ${duration(operationStart, System.nanoTime())}")
    println("Keys count: ${map.keys.size}")


}

fun duration(start: Long, end: Long): Double {
    return (end - start) / 1E9
}

class Key(var obj: Int) {

    override fun hashCode(): Int {
        return obj
    }

    override fun equals(other: Any?): Boolean {
        return obj.equals((other as? Key)?.obj)
    }
}

