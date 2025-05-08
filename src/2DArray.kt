fun main(){
    val matrix = Array(3){
        IntArray(3)
    }

    val stay= arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6),
        intArrayOf(7,8,9)
    )

    print("\n\n"+stay.contentDeepToString())
    var i: Int
    var j : Int
    for (i in 0 until matrix.size){
        for (j in 0 until matrix.size){
            print(" \n Enter Index[$i][$j] :")
            matrix[i][j] = readln().toInt()
        }
    }
    print(matrix.contentDeepToString())
    print(5 in matrix[0])

}