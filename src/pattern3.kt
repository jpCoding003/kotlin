import kotlin.math.min

fun main() {
    var n = 5
    for (i in 1..n) {
        for (j in 1..n-i) {                  //     1
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


    for (i in 1..n){
        for(j in 1..i){
            print(i)
        }
        for (j in n-i downTo 1){
            print("  ")
        }
        for(j in 1..i){
            print(i)
        }
        println()
    }

for (i in 1..n){

    for (j in n downTo i){
        print(" ")
    }

    for (j in i downTo 1){
        print(j)
    }
    for (j in 2..i){
        print(j)
    }
    println()
}

    for (i in 1.. n){
        for ( j in 1..n){
            if (i == 1 || i==n || j == 1 || j ==n){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }

    n = 4
    for ( i in 0..<2*n-1){
        for (j in 0 ..<2*n-1){
            var top = j
            var left = i
            var right = (2*n-1)-1-j
            var down = (2*n-1)-1-i
            var min = (n- min(min(top,left),min(right,down)))
            print(" "+min)
        }
        println()
    }

}
