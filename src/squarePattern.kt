fun main(){
    var n =4
    n= 2*n

    for (i in 0..n){
        for (j in 0..n){
            val index = Math.min(Math.min(i,j), Math.min(n-i,n-j))
            print(" " + index)
        }
        println()
    }

//    0 0 0 0 0 0 0 0 0
//    0 1 1 1 1 1 1 1 0
//    0 1 2 2 2 2 2 1 0
//    0 1 2 3 3 3 2 1 0
//    0 1 2 3 4 3 2 1 0
//    0 1 2 3 3 3 2 1 0
//    0 1 2 2 2 2 2 1 0
//    0 1 1 1 1 1 1 1 0
//    0 0 0 0 0 0 0 0 0


    println("\n\n")


    for (i in 0..n){
        for (j in 0..n){
            val index = Math.max(Math.max(i,j), Math.max(n-i,n-j))
            print(" " + (index- (n/2)))
        }
        println()
    }


// 4 4 4 4 4 4 4 4 4
// 4 3 3 3 3 3 3 3 4
// 4 3 2 2 2 2 2 3 4
// 4 3 2 1 1 1 2 3 4
// 4 3 2 1 0 1 2 3 4
// 4 3 2 1 1 1 2 3 4
// 4 3 2 2 2 2 2 3 4
// 4 3 3 3 3 3 3 3 4
// 4 4 4 4 4 4 4 4 4

}