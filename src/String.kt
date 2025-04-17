fun isPalindrom(str: String): Boolean {
    val reverse = str.reversed()
    return str == reverse
}

fun main() {

    println("Enter a String : ")
    val str1 = readln()

    if (str1?.let { isPalindrom(it) } == true) println("The string is Palindrom")
    else println("The string is not Palindrom")
}