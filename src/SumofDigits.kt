fun main(){
    println("Enter a Number : ")
    val number = readln().toInt()

    if (number == null || number<0){
        println("Enter valid number OR Greater than \"0\" ")
    }

    var num = number
    var sum = 0

    while(num!= 0 ){
        val digit = num % 10
        sum += digit
        num/= 10
    }
    println(" Sum of Digits of $number is : $sum")
}