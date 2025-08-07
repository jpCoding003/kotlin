fun main(){
    val area:Double
    val l:Double
    val b:Double

    //Rectangle
    println("Enter Length of Rectangle: ")
    l = readln().toDouble()
    println("Enter breath of the Rectangle")
    b = readln().toDouble()
    println("Area of Rectangle :  ${l*b}")
    println("Perimeter of the Rectangle : ${(l+b)*2}")

    //Square
    println("Enter Length of Square: ")
    println("The area of Square : ${l*l}")
    println("Perimeter of the Square: ${4*l}")

    //Triangle
    println("Enter Length of Triangle: ")
    val length = readln().toDouble()
    println("Enter Base of Triangle: ")
    val base = readln().toDouble()
    println("Enter Height of Triangle: ")
    val height = readln().toDouble()
    println("The area of Triangle : ${(1/2)*base*height}")
    println("Perimeter of the Triangle: ${length+base+height}")

    //Circle
    println("Enter Length of Circle: ")
    val r = readln().toDouble()
    println("The area of Circle : ${3.14*r*r}")
    println("Perimeter of the Circle: ${2*3.14*r}")

}