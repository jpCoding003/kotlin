fun main(){

        val n = 4

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



//    val n =4
//
//    for (i in 1..n){
//        var a ='A'
//        for (j in n downTo i-1){
//            print(" ")
//        }
//        for (j in 1 .. i){
//            print(a)
//            a++
//        }
//        for (j in 2..i){
//            print(a)
//            a--
//        }
//        println()
//    }
}