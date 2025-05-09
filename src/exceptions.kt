fun main(){


    try {
    println("Enter a Number : ")
    val number = readln().toInt()
    }
    catch (e: NumberFormatException){    //  For Integers value exception "NumberFormatException" is class where it's handeled
        println("Exception Details : Please Enter Integer Values only !!!")
    }
    catch (e: Exception){    // By writting 'Exception' we get the exact Type error from exception class....
        print(e.message)
    }


    try {
//        val string = "123466er"
//        val name = string.toInt()
        val div = 10/0
        print(div)
    }
    catch (e: ArithmeticException){   // If there is Any Arithmetic A=Exception Then it will run this block of 'catch'
        println("Exception details: ${e.message}")
    }
    catch (e: Exception){
        println("Exception : ${e}")
    }
    finally {
        println("It will always be Executed !!!!")  // This block will execute weather there is any exception OR not !!!
    }
}