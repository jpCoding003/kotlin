fun main(){
    val n =3
    for (i in 0..2*n){                               //  *
     //   var value = i>n ? (2*n)-i-1 : n                  //  * *
        var value = if (i>n){(2*n)-i} else{i}              //  * * *
            for (j in 0..value) {                    //  * * * *         // Using Double Loop
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
}