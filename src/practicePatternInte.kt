import kotlin.math.min

fun main(){

    var n=5

    for (i in 1..n){
        for (j in n downTo i-1){
            print(" ")
        }
        var k =i
        for (j in k downTo 1){
            print(k)
            k--
        }
        for (j in 2..i){
            print(j)
        }
        println()
    }

    for (i in 0..<n ){
        for (j in n downTo i+1){
            print(" ")
        }
        for (j in 0..i){
            print(j+1)
        }
        var l = i
        for (j in l downTo 1 ){
            print(l)
            l--
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