fun main(){

   val n=5

    for (i in 1..n){
        for (j in 1 ..i){
            print("* ")
        }
        println()
    }

    for (i in 1 ..n){
        for (j in n downTo i){
            print("* ")
        }
        println()
    }

    for (i in 1..n){
        for (j in n downTo i){
            print(" ")
        }
        for (k in 1..i){
            print("* ")
        }
        println()
    }

    for (i in 1..n){
        for (j in 1..i){
            print(" ")
        }
        for (k in 1..n-i){
            print(" *")
        }
        println()
    }

    for (i in 1..n){
        for (j in n downTo i){
            print(" ")
        }
        for (k in 1..i){
            print("* ")
        }
        println()
    }
}