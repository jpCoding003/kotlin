fun main(){
    val a: Int
    val b: Int
    val c: Int

    println(" Enter 1st Number :")
    a = readln().toInt()
    println(" Enter 2st Number :")
    b = readln().toInt()
    println(" Enter 3st Number :")
    c = readln().toInt()

    if (a>b && a>c || a==b && a>c) println(" $a Is the Greatest among All!!") else if(b>a && b>c|| b==c && b>a) println(" $b Is the Greatest among All!! ")
    else if (c>a && c>b || c==a && c>b) println(" $c Is the Greatest among All") else if (a==b && b==c) println(" All numbers are equal")

    if (a<b && a<c || a==b && a<c) println(" $a Is the Smallest among All!!") else if(b<a && b<c|| b==c && b<a) println(" $b Is the Smallest among All!! ")
    else if (c<a && c<b || c==a && c<b) println(" $c Is the Smallest among All") else if (a==b && b==c) println(" All numbers are equal")
    else println("!!! Enter valid Information !!!")
}