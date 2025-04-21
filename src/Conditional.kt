fun check(num : Int){
    if(num %3==0 && num %5==0){
        println(" The number $num is Divisible By Both 3 and 5... ")
    }else if (num%3==0){
        println("The number $num is Only Divisible by 3...")
    }else if (num%5==0){
        println("The number $num is Only Divisible by 5...")
    }else{
        println("The Number $num is Neither Divisible by 3 nor 5...")
    }
}

fun check1(num: Int){
    when{
        num%3==0 && num%5==0 -> { println(" The number $num is Divisible By Both 3 and 5... ")}
        num%3==0 -> println("The number $num is Only Divisible By  3...  ")
        num%5==0 -> println("The number $num is Only Divisible By 5... ")
        else -> println("The Number $num is Neither Divisible by 3 nor 5...\")\n ")
    }
}

fun main(){
    val num: Int
    println(" \n\n=========== TO CHECK WEATER THE NO. IS DIVISIBLE BY 3 & 5  ===========")
    println(" ENter the Number : ")
    num = readln().toInt()
    println("\n By Nested If-Else Method : ")
    check(num)

    println("\n By When Method : ")
    check(num)
}