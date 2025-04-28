fun leapYear(year: Int) {
    return if (year%4== 0 && year%100 !==0){

        if (year % 400 ==0){
            println("!!!--->  $year is a Leap year   <---!!!")
        } else {

        }
    }else{
        println("  !!! $year is not a leap year ........")
    }
}

//fun check(ch:String) {
//    if (listOf('a', 'e', 'i', 'o', 'u').contains(ch)) {
//        println(" The Entered Character is \" Vowel \"...")
//    } else {
//        println("The Entered Character is \" Consonant \"...")
//    }
//}

fun check(ch:String){
    when(ch){
        "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" -> println(" The Entered Character $ch is \" Vowel \"...")
        else -> println(" The Entered Character is \" Consonant \"...")
    }
}

fun main(){
    val year: Int

    println("Enter the Year to check weather it's Leap year OR Not : ")
    year = readln().toInt()

    var result = leapYear(year)

    println(" Enter Character to check Vowel/Consonant : ")
    val ch = readln().toString()
    result = check(ch)
}