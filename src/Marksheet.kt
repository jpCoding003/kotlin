fun main(){
    var maths: Int
    var english: Int
    var ss: Int
    var sci: Int
    var draw: Int
    println("**************** Marksheet ****************")
    println("Enter Marks Of below Sujects")
    print("Maths :")
    maths = readln().trim().toInt()?: 0
    print("Science :")
    sci = readln().trim().toInt()?: 0
    print("English :")
    english = readln().trim().toInt()?: 0
    print("S.S. :")
    ss = readln().trim().toInt()?: 0
    print("Drawing :")
    draw = readln().trim().toInt()?: 0

    var total = maths + sci + english + ss + draw
    val per: Int = ( total*100 / 500 )
    println("Total Marks obtained in 5 Subjects is $total out of 500.")
    println("Percentage :" + per)
    if (per >= 80) println("Grade: \"A\" ")
    else if (per >= 70 && per <=79) println("Grade: \"B\" ")
    else if (per >= 60 && per <=69) println("Grade: \"C\" ")
    else if (per >= 46 && per <=59) println("Grade: \"D\" ")
    else if (per >= 45 && per <=35) println("Grade: \"E\" ")
    else println("Grade: \"F\" ")
}