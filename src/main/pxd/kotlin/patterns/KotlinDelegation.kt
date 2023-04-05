package pxd.kotlin.patterns

import pxd.java.shared.ProblemPattern

class KotlinDelegation : ProblemPattern {

    override fun solve() {
        // add a property printerDelegate of type Printer to the class header of this class KotlinDelegation
        // syntax is class MyClass(myProperty: TypeOfMyProperty)
        // let the class implement Printer additionally to ProblemPattern (seperate the interfaces with comma)
        // delegate the calls of the interface functions to your delegate by adding the keyword 'by' followed by the
        // object name of your delegate object


        // uncomment following line to see if it is working
        // KotlinDelegation(EpsonPrinter()).print()
    }
}


class EpsonPrinter : Printer {

    override fun print() = println("Epson prints")
    override fun handleNoInk() = println("Buy epson ink")
    override fun handleNoPaper() = println("Buy paper")
}

interface Printer {

    fun print()
    fun handleNoInk()
    fun handleNoPaper()

}