package pxd.kotlin.patterns

import pxd.java.shared.ProblemPattern

class KotlinScopeFunctions : ProblemPattern {

    /*
        There are four functions given for the different scope functions in Kotlin apply, with, let and also

        Choose one for the following use cases (there might be multiple solutions)
            1) Configure an object of type Pizza with optional attributes (you can use the exísting data class for it).
            2) Call multiple functions with the pizza as argument, without repititive writing of the object name
            3) Perform additional actions (like logging) and return the original object
            4) Execute member functions on a nullable object. Note: You need the safe call syntax ?. for this

            BONUS: Switch the values of two variables, without defining a third variable :D
     */

    override fun solve() {
        useScopeFunctionAlso()
    }

    fun useScopeFunctionApply() {

    }

    fun useScopeFunctionWith() {

    }

    fun useScopeFunctionLet() {


    }

    fun useScopeFunctionAlso() {

    }

    fun bonusQuestion() {

    }

}

data class Pizza(var size: Int) {

    var price: String? = null
    var cheese: Boolean? = null
    var peperoni: Boolean? = null
    var bacon: Boolean? = null

    override fun toString() = "$size $price $cheese $peperoni $bacon"
}

