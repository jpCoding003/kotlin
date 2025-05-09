fun main(){

    val range = 1..15

    for (item in range){
        println(item)
    }

    for (item in 1..20 step 2){
        println(item)
    }

    for (item in 1..50){
        if (item %2 ==0 || item %3 ==0){
            print(" $item")
        }
        println()
    }
    for(item in 20 downTo 1 ){
        println(" Down to : $item")
    }

    for (item in 1 until 30){
        println("Until Method : $item ")
    }

    val char12 = 'a'..'z'
    for (char in char12 step 2){
        println(" $char")
    }
}