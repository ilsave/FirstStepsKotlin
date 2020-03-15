package Kot

fun main() {
    val age = 5
    if (age.isAgeValid()){
        println("value!")
    }
    println(age.isPositive())
    println(5.isSimple())

    val list = listOf<Int>()
    myWith(list){
        sum()
    }
//    myWith(string = "alalla"){
//        println(toUpperCase())
//    }
    val obj = mutableMapOf<String, String>()
    myWith(obj){
        keys
        values
    }
}

fun Int.isAgeValid() = this in 6..100

fun Int.isPositive() = this >= 0

fun Int.isSimple(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this){
        if (this % i == 0) return false
    }
    return true
}

//List<Int>.() - значит extention функция над классом лист

fun myWith(list: List<Int>, operation: List<Int>.() -> Unit ){
    list.operation()
}
inline fun<T, R> myWith(obj: T, operation: T.() -> R ): R{
    return obj.operation()
}
