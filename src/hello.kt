fun main(){
    println("!!!  Hello World  !!!")


    var a = 10
    println(a)
    ++a
    println("after ++a --> $a")
    a++
    println("after a++ --> $a")
    --a
    println("after --a --> $a")
    a--
    println("after a-- --> $a")

    println("*********************************************************")
    println("**************** Increment Rules ************************")
    var r = 10
    var v = 10
    println("Initial value: $r")
    println("Using ++r : ${++r}")
    println("Value of a now: $r")

    print("Using ++v : ${++v}")  // Incremented On the same line
    println("      $v")
    print("Using v++ : ${v++}")  // Incremented value applicable from next line
    println("      $v")

    println("Value of a now: $r")
}