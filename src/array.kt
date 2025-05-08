fun main(){
    val name = arrayOf("Jay","Heli","Pappa","Mummyy")
    println(name.contentToString())
    println("Pappa" in name)  // Case Sensitive


    val names: Array<String> = arrayOf("Jpcoding", "Kotlin","Android")
    println(names.contentToString())

    val num = Array(5) {0}
    val i : Int
    println("\n Enter the array of Numbers :")
    for ( i in 0 until num.size){
        println(" Num Value at Index[$i]: ")
        num[i]=readln().toInt()
    }
    println("Array Of Numbers : "+num.contentToString())

    val num1 = intArrayOf(1,23,12,3,5,655,35,565)

    println(num1.contentToString())
    println("Index of '23' in num1 : ${num1.indexOf(23)}")
    println(" Sum of All the digits in Arry : ${num1.sum()}")

    val name1 = Array(4) {" "}
    for ( i in 0 until name1.size){
        println(" Name at Index[$i]: ")
        name1[i]=readln()
    }
    println(name1.contentToString())
    println(name1.first())
    println(name1.last())
    println(name1.size)

    

}