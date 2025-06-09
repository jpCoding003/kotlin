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
}