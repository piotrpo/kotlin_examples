package pl.com.sandbox.kotlinexamples.generics

inline fun <reified T> create(): T {
    return T::class.java.getConstructor().newInstance()
}

fun main(args: Array<String>) {
    println(create<DummyClass>().dummyMethod())

    //println(KGenericFactory(DummyClass::class.java).create().dummyMethod())
}

class KGenericFactory<T>(val clazz: Class<T>) {

    fun create1(): T {
        return clazz.getConstructor().newInstance()
    }
}

class DummyClass {
    fun dummyMethod(): String {
        return "Dummy class text"
    }
}