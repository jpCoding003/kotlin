import java.math.BigInteger

fun main(){

    var fact:Int

    println("Enter Num Factorial: ")
    fact = readln().trim().toInt()
    var factorial = BigInteger.ONE
    for (i in 1..fact){
        factorial *= i.toBigInteger()
    }
    println("Factorial of $fact : "+factorial)


    var num: BigInteger
    print("Enter Any number: ")
    num = readln().trim().toBigInteger()
    var product = BigInteger.ONE
    var sum = BigInteger.ZERO
    var count = 0
    while (num != BigInteger.ZERO){
        count++
        var temp = num%BigInteger.TEN
        product *= temp
        sum += temp
        num /= BigInteger.TEN
        println(temp)
    }
    println("Prouct of all digits: $product")
    println("Sum of all digits: $sum")

    println("Enter any 5 digit number: ")
    num = readln().trim().toBigInteger()
    var numm = num.toString().reversed()
    println(numm)
    if (num.toString() == numm) print("Palindrom number!!") else print("Not a Palindrome number!!")
}
