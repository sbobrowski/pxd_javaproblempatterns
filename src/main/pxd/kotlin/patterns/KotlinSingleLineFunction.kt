package pxd.kotlin.patterns

import pxd.java.shared.ProblemPattern

class KotlinSingleLineFunction : ProblemPattern {

    // Kotlin provides a shortened syntax for single line function without braces, instead the equals sign = is used
    // the complete syntax is: fun nameOfTheMethod() = singleLineStatement
    // e.g. fun helloWorld() = println("Hello World")

    override fun solve() {
        // implement a singleLineFunction called theAnswer, which returns 42, using the shortened syntax
        // uncomment the following lines and see, if it is working


        //val theAnswer = theAnswer()
        //println("The Answer is $theAnswer") // should print The answer is 42


    }

    fun helloWorld() = println("Hello World")
}