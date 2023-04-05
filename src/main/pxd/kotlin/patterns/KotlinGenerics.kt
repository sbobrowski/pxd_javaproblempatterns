package pxd.kotlin.patterns

import pxd.java.shared.ProblemPattern

class KotlinGenerics : ProblemPattern {

    override fun solve() {
        // here is an example of assigning a variable in kotlin
        var foo: String = "Foo"
        // you can omit the type
        var bar = "Bar"

        // create an object of type List<Double> with the values 1.0 and 2.0 (you can use the Factory Method listOf())
        // try to assign the object to a variable of type List<Number>

        // try the same with MutableList and mutableListOf


        // Last create a List with long values, e.g. 1L, 2L, 42L
        // Assign the List to a variable with the postfix 'as List<Double' to convert the List<Long> to a List<Double>


        // println the first value of the list, to see if it is working

    }

}

