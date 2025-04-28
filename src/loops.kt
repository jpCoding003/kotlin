fun main(){
    var a=1
    while ( a <=10){
        println(a)
        a++
    }

    do{
        print(" $a")
        a++
    }while (a<=20)
    println()

    for (a in 1..20){
        print("$a ")
    }
}