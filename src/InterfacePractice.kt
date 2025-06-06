import java.lang.classfile.Interfaces

interface myInterface{

    fun abstractMethod()
    fun concrete(){
        println(" This is a COncrete Method")
    }

    val property: String
    val propertyWithDefault: String
        get() = "Default"
}

class Myclass : myInterface {
    override fun abstractMethod() {
       println(" Abstract Method Implemented!!!")
    }

    override val property: String = "Property Value"

}

interface myInterface2{


    fun concrete(){
        println(" This is a Concrete Method")
    }

}

class Myclass2: myInterface, myInterface2{
    override fun abstractMethod() {
        println(" Abstract Methoid Implemented")
    }

    override fun concrete() {
        super<myInterface>.concrete()
    }

    override val property : String = "Property Value"
}

fun main(){

    val obj = Myclass()
    obj.abstractMethod()
    obj.concrete()
    println(obj.property)
    println(obj.propertyWithDefault)
}