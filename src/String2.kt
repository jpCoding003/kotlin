fun checkNumber(a: Int){
    when{
        a>0 -> println(" The Number is : Positive")
        a<0 -> println(" The Number is : Negative")
        a==0 -> println(" The Number is : Zero ")
        else -> println(" Enter Interger value")
    }
}

fun main(){
    val a:Int

    print(" Enter Number to Check Weather it's Postive, Negative OR Zero : ")
    a = readln().toInt()
    checkNumber(a)

    // SImple loop
    for (b in 1..10){
        print(b)
    }
println()
    // When conditional loop
    for (b in 1..20){
        when(b%2==0){
            true -> print(b)
            else -> { print(" ")}
        }
    }

}