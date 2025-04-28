import kotlin.math.floor

data class ProfitLoss(val buy: Float,val sale: Float){

    val pl = sale - buy

}

fun main(){

    val product: String
    val buy: Float
    val sale: Float
    println(" ============== Profit & Loss ==============")
    println(" Enter Product Name You Buy : ")
    product = readln().toString()

    println(" Enter Amount You Paid to Buy the $product : ")
    buy =readln().toFloat()

    println(" Enter Amount at what you Saled The $product : ")
    sale = readln().toFloat()


    //ProfitLoss(buy,sale)
    if (ProfitLoss(buy,sale).pl>0) {
        println(" You Made \"Profit\" of ${ProfitLoss(buy, sale).pl}/- ")
    }else if (ProfitLoss(buy,sale).pl<0){
        println(" You Made \"Loss\" of ${ProfitLoss(buy, sale).pl}/- ")
    }else {
        println(" You Saled the $product at Same amount you Buyed it, SO  ")
        println("!!! You didn't Made any \"Profit\" OR \"Loss\" !!!")
    }
}