package Kot

fun main() {
    val array = (0..10).toList()
    val employess = array.map { "Employee №$it" }
    val first3 = employess.take(3)
    val last3 = employess.takeLast(3)
    val first5 = employess.drop(2) //удалит первые 2 и вернет оставшиеся
    val last5 = employess.dropLast(2) //удалит последние и вернет оставшиеся
    println("first 5 ?")
    for (employee in first5){
        println(employee)
    }
    println("qwertg")
    for (employee in first3){
        println(employee)
    }
    println()
    for (employee in last3){
        println(employee)
    }
    println()
    val array7 = generateSequence('A'){
        println("Сгенерировано: ${it + 2}")
        it + 2
    }
    val evenList = array7.take(10)
    for(i in evenList){
        println(i)
    }
    println()
    val randomArray = generateSequence { (Math.random() * 100).toInt() }
    val evenListrandom = randomArray.take(10)
    for (a in evenListrandom){
        println(a)
    }
    val randomArrayname = generateSequence { (Math.random() * 100).toInt() }
    val evenListrandomname = randomArrayname.take(10)
    for (a in evenListrandomname){
        println("sotrydnik№${a}")
    }
}