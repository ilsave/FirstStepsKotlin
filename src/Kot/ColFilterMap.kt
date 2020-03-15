package Kot

import kotlin.random.Random

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for(i in 0..9){
        listOfNumbers.add(i)
    }
    val listofEvenNumbers = listOfNumbers.filter { number : Int -> number % 2 == 0} //фильтрация через предикейт
    println(listofEvenNumbers)

    val listOfNames = mutableListOf<String>("Alex", "Nikolay", "Kate", "Violetta")
    val sortedNames = listOfNames.filter {a : String -> a.startsWith("A") }
    println(sortedNames)

    val numbers = (0..15).toList()
    val employees = numbers.map{"Employee №$it"} //создание другого листа с другим типом (теперь стринг)
    println(employees)

    val doubleNumbers = numbers.map { number : Int -> number*2 } //из нашего листа сделали другой лист с удвоенными значениями
    println(doubleNumbers)

    val array = arrayOf(1,2,4,5,6,1)
    val sortedArray = array.sortedDescending() //сортировка по убыванию
    println(sortedArray)

    val randomCollection = arrayOf((0..1000).shuffled().first(),(0..1000).shuffled().first(),(0..1000).shuffled().first(),(0..1000).shuffled().first())
    for (i in randomCollection){
        println(i)
    }
    val sortedhomework = randomCollection.filter { it % 5 == 0 || it % 3 == 0 }
    val squarehomework = randomCollection.map { it * it }
    val sortedtolowhomework = randomCollection.sortedDescending()
    val stringColHomework = randomCollection.map { "$it" }
    println("sorted homework $sortedhomework")
    println("square homework $squarehomework")
    println("sorted to low homework $sortedtolowhomework")
    println("stringColHomework $stringColHomework")


    //other way to write it in one line
    val initArray = mutableListOf<Int>()
    for(i in 0 until 20){
        initArray.add((Math.random() * 10).toInt())
    }
    val result = initArray.filter{it % 5 == 0 || it % 3 == 0}.map{it * it}.sortedDescending().map{"$it"}
    println(result)



}