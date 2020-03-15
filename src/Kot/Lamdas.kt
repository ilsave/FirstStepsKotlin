package Kot

fun main() {
    val sur : (Int, Int) -> Int = {a,b -> a+b}
    println(sur(1,2))

    val square: (Int) -> Int = { it * it }
    println(square(4))

    val perimetr: (a: Int, b:  Int) -> Int = {a,b -> 2*a+2*b}
    println("периметр со сторонами 3 и 5 равен ${perimetr(3,5)}")

    val privet: (String) -> String = {a -> "Hey, $a"}
    println(privet("my sweet girl Sasha"))

    val sortmas: (Array<Int>) -> Array<Int> = {
        it[1]=23
        it
    }
    val arraystart = sortmas(arrayOf(1,2,3,4,5))
    for(i in 0 until arraystart.size){
        println(arraystart[i])
    }
}