package Kot

fun main() {
    println(sum("12", "123"))
    println(sum(12,21))
}

fun sum(a: String, b: String): Int{
    return try {
       val num1 = a.toInt() + b.toInt()
        num1
    }catch (e: Exception){
        0
    }
}