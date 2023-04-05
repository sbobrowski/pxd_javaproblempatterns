package pxd.kotlin.patterns

import pxd.java.shared.ProblemPattern

class KotlinUtilClass : ProblemPattern {

    override fun solve() {
        val name1 = "Otto"
        val name2 = "Joe"

        // Write an so called extension function of the type String which checks, if the string is a pallindrom
        // A pallindrom is a word, which is the same reversed (case insensitive)
        // Writing an extension function is the same like a normal function, just prefix it's name with the class name
        // you want to extends (in this case String)


        // Uncomment following two lines, to see if it is working
        //println("$name1 is pallindrom ${name1.isPallindrom()}")
        //println("$name2 is pallindrom ${name2.isPallindrom()}")

        // Side note here: This println statement use the kotlin feature of string interpolation
    }

    fun demoOfAlreadyExistingExtensionFunctionsInKotlin() {
        val numbers = listOf(1, 4, 5, 8, 12, 15)

        numbers.filter { it % 2 == 0 }.forEach(::println)
    }

}
