fun main(){

    println("---------------------------------------------------------------------------------------")
    val numbers = mutableListOf(1,-2,-3,4,-5,6,-7,8,9,-10,11,12,13,15,-19,-1,8,25,20,-34,31,26,-29,38,39,-41,43,-42,45,-46,41,-48)
    val evenNumbers = numbers.filter { it %2 == 0 }
    val (even,odd) = numbers.partition { it %2 == 0 }
    val positive = numbers.filter { it >= 0 }
    val negative = numbers.filter { it < 0 }
//    val primeNumber = numbers.filter { it %2 == 0 || }

    println(" Odd number in the list : $odd")
    println(" Even number in the list : $even")
    println("\n //---------------------------------------------------------------------------------------\n")
    println("Even Numbers: $evenNumbers")
    println("\n //---------------------------------------------------------------------------------------\n")
    println("Positive Numbers : $positive")
    println("\n //---------------------------------------------------------------------------------------\n")
    println("Negative Numbers : $negative")
    println("\n ---------------------------------------------------------------------------------------\n")
    val name = mutableListOf("Jay","John","Naimesh","Helly","Wellcome","Pathhh")
    val name1 = setOf("Jay","John","Naimesh","Helly","Wellcome","Pathhh")
    println("This is the Set : $name1")
    println(name)
    name.add("jenish")
    println(name)
//    println(name1)

    println("Number of elements in Name[] List :  $name.count()")
    println("Number of characters in each element of the list : ${numbers.count()}")
    println("First element of set is : ${name[0]}")
    println("\n ---------------------------------------------------------------------------------------\n")
    val names = mutableListOf<String>()

    println("Enter names (type 'done' to finish):")
    while (true) {
        val input = readlnOrNull()
        if (input.equals("done", ignoreCase = true)) {
            break
        }
        input?.let { names.add(it) }
    }
    println(names)
    println("Length of the 'Names' List Created is :  ${names.size}")
}