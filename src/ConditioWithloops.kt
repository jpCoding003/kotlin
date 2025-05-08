fun main(){
    val names: Array<String> = arrayOf("Jpcoding", "Kotlin","Android", "Java", "CodingNinja","YouTube","insta")
    println(" Names :"+names.contentToString())
    var count=0
    var cnt = 0
    for (item in names){ cnt++ }
    for ((index,item) in names.withIndex() ) {
        if (index == 3 || index == 4)continue
        println(" Names at $index is $item")
        count++
    }
    println(" \nTotal Names in The List Mentioned Above : $count")
    println(" ")
}