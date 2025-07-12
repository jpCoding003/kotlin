fun main(){
    val n =5
    for (i in 1..2*n){                               //  *
     //   var value = i>n ? (2*n)-i-1 : n                  //  * *
        var value = if (i>n){(2*n)-i-1} else{i}            //  * * *
            for (j in 1..value) {                    //  * * * *         // Using Double Loop
                print("*")                                 //  * * *
            }                                              //  * *             // here two loops are not combine to create this patter!!!!!!!
            println()                                      //  *               // Patter is created in a single loop operation !!!!!!
    }

    println("\n\n\n")
    var a =0
    for (i in 0..7){
        for (j in 0..i){
            if (j==0 || j==i || i==7  ){
                print("  * ")

            }else{
                print(" $a")
                a++
            }
        }
        println()
    }
    println()

     for (i in 1..n){
         for (j in 1..(n-i)){              //     1
             print("  ")                         //    212
         }                                       //   32123
         for (j in i downTo 1){            //  4321234
             print("$j ")                        // 543212345
         }
         for (j in 2..i){
             print("$j ")
         }
         println()
     }

    println("\n")


    for (i in 1..2*n){

        val c  = if(i > n ) {2 * n - i} else {i}
        for (j in 1..(n-c)){                           //     1
            print("  ")                                      //    212
        }                                                    //   32123
        for (j in c downTo 1){                         //  4321234
            print("$j ")                                     // 543212345
        }                                                    //  4321234
        for (j in 2..c){                               //   32123
            print("$j ")                                     //    212
        }                                                    //     1
        println()
    }

    var b = 1
    for (i in n downTo 1){

        for (j in 1..i){
            print(b)

        }
        b++
        println()
    }

    for (i in 0..n){
        for (j in 1..n-i){              //     1
            print(" ")                        //    1 1
        }                                     //   1 2 1
        var num = 1                           //  1 3 3 1
        for (j in 0..i){                // 1 4 6 4 1
            print("$num ")                    //1 5 10 10 5 1
            num = num*(i-j)/(j+1)
        }
        println()
    }

    var start= 0
    for (i in 0..<n){                                    //  1
        if (i%2 == 0) start = 0 else start = 1              //  0 1
        for (j in 0..<i){                                //  1 0 1
            print(start)                                    //  0 1 0 1
            start = 1-start                                 //  1 0 1 0 1
        }
        println()
    }


}