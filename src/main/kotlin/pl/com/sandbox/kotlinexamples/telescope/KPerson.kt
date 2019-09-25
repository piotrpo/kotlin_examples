package pl.com.sandbox.kotlinexamples.telescope


class KPerson @JvmOverloads constructor(
        val name: String,
        val lastname: String,
        val age: Int? = null,
        val children: Int? = null) {

    constructor(kPerson: KPerson,
                name: String = kPerson.name,
                lastname: String = kPerson.lastname,
                age: Int? = kPerson.age,
                children: Int? = kPerson.children) : this(name, lastname, age, children)
}


fun instantiate() {

    KPerson("John", "Smith")
    KPerson("John", "Smith", 42)
    KPerson("John", "Smith", 42, 2)
    val kPerson = KPerson("John", "Smith", children = 2)

    val copiedAndChanged = KPerson(kPerson, age = 43)

}