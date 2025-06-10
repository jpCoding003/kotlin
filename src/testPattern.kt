fun main(){
    var n =5
    var a= 'A'
    for (i in 1..2*n-1){
        if (i<=n) {
            for (j in n - 1 downTo i) {
                print("*")
            }
            print(a)
            for (j in 1..i - 1) {
                print("*")
            }
            for (j in 2..i - 1) {
                print("*")
            }
            if (a=='A'){

            }else {
                print(a)
            }
            a++
            println()
        }else{
            for (j in 1..i-n){
                print("*")
            }
            print(a-2)
            for (j in 1..2*n-i-1){
                print("*")
            }
            for (j in 2*n-i-1 downTo  2){
                print("*")
            }
            if (a-2=='A'){ }else {
                print(a-2)
            }
            a--
            println()
        }
    }

    for (i in 1..n){
        for (j in n-1 downTo i) {
            print(" ")
        }
        for (j in 0..i-1){
            print('A'+j)
        }
        for (j in i-2 downTo 0){
            print('A'+j)
        }
        println()
    }
}