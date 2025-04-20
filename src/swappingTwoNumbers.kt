fun main(){
    var a:Int
    var b:Int
    var c:Int

    println("Enter Number A: ")
    a = readln().toInt()
    println("Enter Number B: ")
    b = readln().toInt()

    // Using Third variable
    println("Using Third variable: (Swapping)")
    c = a
    a=b
    b=c
    println(" A = $a \n B = $b")

    // Without Using Third variable
    println("Without Using Third variable: (Swapping)")
    a += b
    b= a-b
    a -= b
    println(" A = $a \n B = $b")

    // Using kotlin fun .also{..}
    println("Using Kotlin pre define Function for Swapping: (Swapping) ")
    a = b.also { b= a }
    println(" A = $a \n B = $b")


    //Uses of .also{ . .}
    val name = "ChatGPT".also { println("The name is $it") }
    println(name) // Only prints Chatgpt

}