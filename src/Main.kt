fun main() {
    println("Hello World!")
    val a =10
    val b = 15
    println(" Addition :${a+b}")
    println(" Division :${(a+b)/3 }")

//    a=10  variable declare with " Val " can't allow to change value
//    initialize variable with var where the change of values in specific variable is needed else always use val

    var number = 10
    println(" ----------  Number =  $number  ----------")
    number += 5
    println("After Doing     number += 5      value is number is:     $number")
    number -= 10
    println("After Doing     number -= 10     value is number is:     $number")
    number *= 2
    println("After Doing     number *= 2      value is number is:     $number")
    number /= 2
    println("After Doing     number /= 2      value is number is:     $number")

    val members = listOf(5)


    }