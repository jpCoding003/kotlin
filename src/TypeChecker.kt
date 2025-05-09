import java.lang.classfile.instruction.TypeCheckInstruction

fun main(){

    val name = "Jayy"
    val num = 20
    println("\n\n ================ Check Type of the Variable ================")
    println("\n ----------Type of DATA Present in the Variable----------  ")

    println(typecheck(name))         // As this Don't return any value then it will, display :  " kotlin.Unit "  in 'OUTPUT'
    println(typecheck(num))
    println(typecheck('c'))

    println("\n================================================================")
    typecheck(name)
    typecheck(num)
    typecheck('c')
    println("\n================================================================")

    println("\n Type Casting: ")
    val num1 : Any? = 100253
    val str : Int? = num1 as? Int         // To type cast the data-type..........
    val a = 10
    println(message = "Variable in Int :  ${a ::class.simpleName} ")   // To print the Data-Type of the Data present in the Variable

}

fun typecheck(obj: Any){

    when(obj) {
         is String ->{
            println("The Type for GIven Object is : String ")
            println("The length of String is : ${obj.length}")
        }
         is Int->{
                println("The Type for Given Object is : Int ")
            }
    }
}