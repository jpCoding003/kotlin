fun main(){
    val n =4
    var num = 1
    for (i in 1..n){
//        for (j in n downTo i){
//            print(" ")
//        }
        for (k in 1..i){
            print("$num")
            num++
        }
        println()
    }

    num = 1
    for (i in 1..n){

        for(j in n downTo i){
            print(" ")
        }
        for (k in 1..i){
            print(num)
            num++
        }
        println()
    }


    num = 1
    for (i in 1..n){

        for(j in n downTo i){
            print(" ")
        }
        for (k in 1..i){
            print(" "+num)
            num++
        }
        println()
    }


}