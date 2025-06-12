
fun main() {
    val n = 5
    for (i in 1..n) {
        for (j in 1..(n - i)) {              //     1
            print("  ")                            //    212
        }                                          //   32123
        for (j in i downTo 1) {              //  4321234
            print("$j ")                           // 543212345
        }
        for (j in 2..i) {
            print("$j ")
        }
        println()
    }

    println("\n")


    for (i in 1..2 * n) {

        var c = if (i > n) {
            2 * n - i
        } else {
            i
        }


        for (j in 1..(n - c)) {                           //     1
            print("  ")                                         //    212
        }                                                       //   32123
        for (j in c downTo 1) {                           //  4321234
            print("$j ")                                        // 543212345
        }                                                       //  4321234
        for (j in 2..c) {                                 //   32123
            print("$j ")                                        //    212
        }                                                       //     1
        println()
    }

    println("\n")

    for (i in 1 ..n ){

        for (j in n downTo i){
            print(" ")
        }
        for (j in 1..i){                         //     1
            print(j)                                   //    121
        }                                              //   12321
        for (k in i-1 downTo 1){                 //  1234321
            print(k)                                   // 123454321
        }
        println()
    }

    println("\n")


    for (i in 1 ..2*n ){                         //     1
        val c  = if(i > n ) {2 * n - i} else {i}       //    121
        for (j in n downTo c){                   //   12321
            print(" ")                                 //  1234321
        }                                              // 123454321
        for (j in 1..c){                         //  1234321
            print(j)                                   //   12321
        }                                              //    121
        for (k in c-1 downTo 1){                 //     1
            print(k)
        }
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
