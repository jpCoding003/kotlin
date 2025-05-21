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
}