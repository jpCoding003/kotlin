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

    var w =0
    for (i in 0..7){
        for (j in 0..i){
            if (j==0 || j==i || i==7  ){
                print("  * ")

            }else{
                print(" $w")
                w++
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


    var q=1
    for (i in 1..n){
        for (j in 1..i){
            print(q)
            q++
        }
        println()
    }

    for (i in 1..n) {
        for (space in 1..(n - i)) {       //  'A' + 0 → 'A' (ASCII 65)
            print(" ")                          //  'A' + 1 → 'B' (ASCII 66)
        }                                       //  'A' + 2 → 'C' (ASCII 67)
        for (j in 0 until i) {
            print(('A' + j))
        }                                         //     A
        for (j in (i - 2) downTo 0) {       //    ABA
            print(('A' + j))                      //   ABCBA
        }                                         //  ABCDCBA
        println()
    }

    var a = 'A'
    for (i in 1..2*n-1) {

        if (i<=n){
            for (j in n-1 downTo i) {                   //      A
                print(" ")                                    //     B*B
            }                                                 //    C***C
            print(a)                                          //   D*****D
            for (j in 2..i) {                           //  E*******E
                print("*")                                    //   D*****D
            }                                                 //    C***C
            for (j in 3..i){                            //     B*B
                print("*")                                    //      A
            }
            if (a>'A'){
                print(a)
            }
            a++
            println()
        }else{
            for (j in i-n downTo 1){
                print(" ")
            }
            print(a-2)
            for (j in 1..2*n-i-1){
                print("*")
            }
            for (j in 2*n-2-i downTo 1){
                print("*")
            }
            if (a-2=='A'){

            }else{
                print(a-2)
            }
            println()
            a--
//            print(a)
//            println()
        }
    }

}


