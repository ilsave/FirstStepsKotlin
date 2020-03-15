package Kot

fun main() {
    val data12 = mapOf(
        "Январь" to listOf(100,200,15,300,231),
        "Февраль" to listOf(11,234,123,-432,11),
        "Март" to listOf(14,167,189,12,11),
        "Апрель" to listOf(14,56,85,123,-56),
        "Май" to listOf(11,45,11,4567,11,23),
        "Июль" to listOf(1,245,787,321,321)
    )
    printInfo(data12)
}

fun printInfo(data12 : Map<String, List<Int>>){
    val validData = data12.filter { it -> it.value.any{it > 0} }
    val averageWeek = data12.flatMap { it.value }. average()
    println("Middle money for week :$averageWeek")

    val listOfSum = validData.map{it.value.sum()} // сумма всех элементов
    val max = listOfSum.max()
    val min = listOfSum.min()
    val averageMonth = listOfSum.average()

    val maxMonth = validData.filter { it.value.sum() == max }.keys // получили имя месяца с наибольшей вырочкой
    val minMonth = validData.filter{it.value.sum() == min}.keys

    println("Middle money for month $averageMonth")
    println("Max money $max")
    print("It was in this months")
    for (month in maxMonth){
        print(" $month ")
    }

    println("\nMin money $max")
    print("It was in this months ")
    for (month in minMonth){
        print("$month ")
    }

    val invalidData = data12.filter { it -> it.value.any{it < 0} }
    val errorMonths = invalidData.keys
    print("\n Errors in this months ")
    for(month in errorMonths){
        print("$month ")
    }
}