fun grade(marks: Int){
    when{
        marks>40 -> println(" You Are Failed This Year!!!")
        41<marks && marks<60 -> println(" You Have Passes This Year With Grade: C Grade")
        61<marks && marks<80 -> println(" You Have Passes This Year With Grade: B Grade")
        marks>81 -> println(" You Have Successfully Passed This Year With Grade: A Grade")
        else -> println(" !!!  Please Enter Valid marks  !!!")

    }
}

fun main(){

    val marks: Int
    println(" Enter the total marks you obtained :")
    marks = readln().toInt()
    grade(marks)

}