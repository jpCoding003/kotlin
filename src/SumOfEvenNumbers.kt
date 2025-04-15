fun main(){
    var sum =0
    var a=0

    for (i in 1..100){
        if (((i % 2) == 0)) {
            sum += i
        }
    }
    println(sum)
}