package pxd.kotlin.patterns

import pxd.java.shared.ProblemPattern

class KotlinNullSafety : ProblemPattern {

    override fun solve() {
        // in Kotlin variables can have a nullable type or a non-nullable type
        // this is identified by a question mark after the class name: String? vs String

        // create a non-nullable String variable
        // try to assign null to it


        // change the type to String?, the assignment should work now
        // create a function, with a non-nullable String parameter
        // try to call the method on your String? object
        // wrap the method call in a !=null if-Statement


        // Last, let's try safe calls and the elvis operator
        // Create a person variable, you can assign the result of the given function getExamplePerson
        // Try to access the street of the address by chaining the field access methods person.address.street
        // Change the field access to field access to a safe call (use '?.' instead of '.')
        // add the elvis operator ?: add the end of the chain to provide a default value for the street


    }

    fun exampleFunctionWithNullableParameter(parameter: String?) = parameter?.let { println(it) }

    fun getExamplePerson() = Person("Mustermann", "Max", null)
}

data class Person(val name: String, val firstName: String, val address: Address?)

data class Address(val zip: String, val street: String?, val town: String)