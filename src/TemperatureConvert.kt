fun main(){
    val temp:Double
    val cel:Double

    println("Enter Temp in Fahrenheit: ")
    temp = readln().toDouble()
    println("After Converting!!")
    cel = (temp-32)*5/9
    println("Temperature in Celsius: $cel")
}