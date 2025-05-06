fun main() {

    var count = 0
    var array: IntArray = IntArray(5)

    for (i in 0 until 5) {
        println(" Enter value at [$i]index : ")
        array[i] = readln().toInt()
    }
    println(array.contentToString())



    var name = " JAy Patel"
    print(name)
}
