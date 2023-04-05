package pxd.kotlin.patterns

import pxd.java.shared.ProblemPattern

class KotlinAdditionalParameters : ProblemPattern {

    override fun solve() {
        // implement a function "printName" with three parameters firstName, middleName, lastName
        // you can adopt the exampleFunction for that
        // add default values for middleName and lastName, so that the function can be called only with one parameter
        // for that just add '= defaultValue" add the end of each parameter, e.g. parameter: String = "default"

        // See if it working by calling the function with only one parameter. Uncomment following line
        //printName("Prodyna")

        // Try to call the function with two and three parameters
        // Code here:


        // Try to call the function with firstName and lastName, leaving middleName at default
        // To do so, you can use a feature called 'named arguments',
        // e.g. printName(firstParameter, parameterName = thirdParameter)
        // Code here:

    }

    // this is an example function. The println statement uses string interpolation to embed string into the statement
    fun exampleFunctionWithParameters(parameter1: String, parameter2: String) = println("$parameter1, $parameter2")

}