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
    println()
    println()
    println()


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

    for (i in 1..n){
        for (j in 1..i){
            if (i== 1 || i==n|| j==1|| j ==i){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }

    println("\n\n")

    for (i in 1..2*n){
        if (i<=n){
            for (j in n downTo i){
                print("*")
            }
            for (j in 2..i){
                print("  ")
            }                                         // **********
            for (j in n downTo i){              // ****  ****
                print("*")                            // ***    ***
            }                                         // **      **
            println()                                 // *        *
        }else{                                        // *        *
            for (j in n..i-1){                  // **      **
                print("*")                            // ***    ***
            }                                         // ****  ****
            for (j in 2*n-i downTo 1){          // **********
                print("  ")
            }
            for (j in n .. i-1){
                print("*")
            }
            println()
        }

    }


    for(i in 0..<n){
        for (j in n-2 downTo i ){
            print(" ")
        }
        for (j in 1..2*i+1 ){
            print("*")
        }
        for (j in n-2 downTo i){
            print(" ")
        }
        println()
    }


    for(i in 0..<n){
        for (j in 0..<i){
            print(" ")
        }
        for (j in 0..<2*n-2*i-1){
            print("*")
        }
        for (j in  0..<i){
            print(" ")
        }
        println()
    }

    for (i in 1..<2*n){
        if (i<=(2*n/2)){
            for (j in 1..i){
                print("*")
            }
        }else{
            for (j in 1..2*n-i){
                print("*")
            }
        }
        println()
    }

    for (i in 1..<2*n){
        val limit = if (i<=(2*n/2)) i else 2*n-i
            for (j in 1..limit ){
                print("*")
            }

        println()
    }

}