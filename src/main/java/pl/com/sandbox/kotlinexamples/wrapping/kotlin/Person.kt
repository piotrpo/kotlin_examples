package pl.com.sandbox.kotlinexamples.wrapping.kotlin

import java.math.BigDecimal

interface IPerson {
    var name: String
    var lastName: String
}

class Person(override var name: String, override var lastName: String) : IPerson

open class ForwardingPerson(private val person: IPerson) : IPerson by person

class PersonWithAccountBallance(person: IPerson, var balance: BigDecimal) : ForwardingPerson(person)