fun main(){

    val email: String
    val password: String
    val name: String
    val choice: Int

    println(" \n\n======================== Login/Signup System ========================")
    println(" \n 1. Login ( Already have an Account!! )")
    println(" \n 2. Signup ( Don't have Account!!/ NEW USER )")
    println(" \n 3. Show Users Already Logined...")
    println(" \n Enter your Choice to Perform :  ")
    choice = readln().toInt()

    when(choice){
        1 -> {
            println(" \n Enter Email :      ")
            email = readln()
            println(" \n Enter Password:    ")
            password = readln().toString()
            println("Email    : $email")
            println("Password : $password")
        }
        2 -> {
            println(" \n Enter Name  :   ")
            name = readln().toString()
            println(" \n Enter Email :   ")
            email = readln()
            println(" \n Enter Password: ")
            password = readln().toString()

            println("Username : $name")
            println("Email    : $email")
            println("Password : $password")
        }
        3-> {
        }
        else -> println("!!!---Enter Valid Choice---!!!")
    }

//    println(name)
//    println(password)

}