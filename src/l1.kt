fun main(){
    var n = 10
    for(i in 1..n){
        print(" $i")
    }
    println()
    println()

    for (i in 10 downTo 1){
        print(" $i")
    }
    println()
    for (i in 1..100){
        if (i%2 == 0){
            print(" $i")
        }
    }
    println()
    for (i in 1..100){
        if (i%2 != 0){
            print(" $i")
        }
    }

    println()
    print("Enter number for Table : ")
    var num:Int = readln().trim().toInt()?: 0
    for (i in 1..10){
        println(" $num X $i = "+ num*i)
    }


    println()
    print("Enter number to get sum of all : ")
    var num1: Int = readln().trim().toInt()?: 1
    var sum = 0
    for (i in 1..num1){
        sum += i
    }

    println(" Sum of number from 1 to $num1 : "+sum)

}