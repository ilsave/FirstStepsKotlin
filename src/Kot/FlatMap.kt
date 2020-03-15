package Kot

fun main() {
    val revenueByWeek = listOf(
        listOf(1,2,3,4,5),
        listOf(1,2,3,4,5),
        listOf(1,2,3,4,5)
    )
    val total = revenueByWeek.flatMap { it } // все листы будут развернуты и на выходе получим просто массив числе

    val average = total.average()

    println(average)

    //map collection
    val data = mapOf<String, List<Int>>(
        "file1" to listOf(1,2,421,4,45),
        "file2" to listOf(-1,2,4,4,45),
        "file3" to listOf(1,-2,41,4,45)

    )

//    data["file1"] = listOf(1,2,421,4,45)
//    data["file2"] = listOf(1,1232,3,432,5) если бы был мутабельным лист
//    data.put("file3", listOf(1,212,3,214,5))//одно и тоже что и навернху

    val average1 = data.filter{it.value.all { it > 0 }}.flatMap { it.value }.average() // все значения больше нудя
    println(average1)
//еще есть .any вернет 1 если хотя бы один элемент больше 0 



}