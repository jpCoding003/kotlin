fun main(){

    val n=5

    for (i in 1..n){
        for (j in n-1 downTo i){
            print(" ")
        }                                                  //    1
        var k = i                                          //   232
        for (j in 1..i){                             //  34543
            print(k)                                       // 4567654
            k++                                            //567898765
        }
        k--
        k--
        for (j in i downTo 2){
            print(k)
            k--
        }
        println()
    }

    for (i in 0 ..<n){
        for (j in n-1 downTo i+1){
            print(" ")
        }
        for (j in 1..(2*i)+1){
            print("*")                                      //    *
        }                                                   //   * *
        println()                                           //  *   *
    }                                                       // *     *
                                                            //*********
    for (i in 0 ..<n){
        for (j in n-1 downTo i+1){
            print(" ")
        }
        for (j in 1..(2*i)+1){
            if ( i == 0|| i == n-1|| j == 1 || j == 2*i+1){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }

    // Reverse
    for (i in 0..<n){
        for (j in 1..i){
            print(" ")
        }                                                                   //*********
        for (j in 2*i+1 ..2*n-1 ){                                    // *     *
            if ( i == 0|| i == n-1|| j == 2*i+1 || j == 2*n-1){             //  *   *
                print("*")                                                  //   * *
            }else{                                                          //    *
                print(" ")
            }
        }
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

    for (i in 1..2*n){                         //  *
        //   var value = i>n ? (2*n)-i-1 : n         //  * *
        var value = if (i>n){(2*n)-i-1} else{i}      //  * * *
        for (j in 1..value) {                  //  * * * *     // Using Double Loop
            print("*")                               //  * * *       // here two loops are not combine
        }                                            //  * *         //to create this patter!!!!!!!
        println()                                    //  *           // Patter is created in a single loop operation !!!!!!
    }


}