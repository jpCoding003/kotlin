fun main() {

    var count = 0
    var array: IntArray = IntArray(5)
/*
    for (i in 0 until 5) {
        println(" Enter value at [$i]index : ")
        array[i] = readln().toInt()
    }
    println(array.contentToString())
*/
    var name = " JAy Patel"
    println(name)

    var fruits: MutableList<String> = mutableListOf("1Apple","2Samsung","3MotoRola","4MI","5Vivo")
    var temp: MutableList<String> = mutableListOf()

    for (fruit in fruits.sortedDescending()){
        temp.add(fruit)
        fruits.remove(fruit)
    }

    println("fruits list :"+fruits)
    println("temp list: "+temp)

}
