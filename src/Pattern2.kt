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

        var c  = if(i > n ) {2 * n - i} else {i}
        for (j in 1..(n-c)){              //     1
            print("  ")                         //    212
        }                                       //   32123
        for (j in c downTo 1){            //  4321234
            print("$j ")                        // 543212345
        }
        for (j in 2..c){
            print("$j ")
        }
        println()
    }



}