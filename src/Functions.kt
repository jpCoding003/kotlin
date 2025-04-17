fun add( x:Int=0,  y:Int=0,  z:Int=0){
    val add = x + y + z
    println("Addition of $x , $y and $z  is : $add")
}

fun multi(x:Int=0,  y:Int=0,  z:Int=0){
    val mul = x * y * z
    println("Multiplication of $x , $y and $z  is : $mul")
}

fun div(x:Double=0.0,  y:Double=0.0,  z:Double=0.0){
    val div:Double = (x / y) / z
    println("Division of $x , $y and $z  is : $div")
}

fun sub(x:Int=0,  y:Int=0,  z:Int=0){
    val sub = x - y - z
    println("Subtraction of $x , $y and $z  is : $sub")
}


fun main(){

    print("\nEnter Number X :")
    val x = readln().toInt()

    print("\nEnter Number Y :")
    val y = readln().toInt()

    print("\n Enter Number Z :")
    val z = readln().toInt()

    add(x,y,z)
    sub(x,y,z)
    multi(x,y,z)
    div(x.toDouble(),y.toDouble(),z.toDouble())
}
