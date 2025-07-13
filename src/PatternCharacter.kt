import kotlin.coroutines.coroutineContext

fun main(){

        val n = 5

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

    for (i in 1..n){
        var v = 'A'
        for (j in 1..i){
            print(v)
            v++
        }
        println()
    }


    for (i in n downTo 1){
        var q = 'A'
        for (j in i downTo 1){
            print(q)
            q++
        }
        println()
    }
    var z = 'A'
    for (i in 1..n){
        for (j in 1..i){
            print(z)
        }
        z++
        println()
    }

    for (i in 1..n){
        for (j in n downTo i){
            print(" ")
        }
        var r = 'A'
        for (j in 1..i){
            print(r)
            r++
        }
        r--
        for (j in 2 .. i){
            r--
            print(r)
        }
        println()
    }

//    var o = 'E'
    for (i in 1..n){
//        var l = o
//        o--
        for (j in 'F'-i..'E'){
            print(j)
//            l++
        }
        println()
    }



}