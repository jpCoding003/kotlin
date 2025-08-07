fun main(){
    val matrix = Array(3){
        IntArray(3)
    }

    val stay= arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    )

    print("\n\n"+stay.contentDeepToString())

    var j : Int
    for (i in 0 until matrix.size){
        for (j in 0 until matrix.size){
            print(" \n Enter Index[$i][$j] :")
            matrix[i][j] = readln().toInt()
        }
    }
    print(matrix.contentDeepToString())
    print(5 in matrix[0])



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