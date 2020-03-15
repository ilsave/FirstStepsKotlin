package Kot

import kotlin.coroutines.coroutineContext

fun main() {
    val array1:Array<Int?> = arrayOf(1,2,4,5) // массив элементов типа инт
    val array2:Array<Int?> = arrayOfNulls(10) // создание массива из нуллов
    val array3 = arrayOf(1,null, 3,2) // создание массива который может содержать нулл (и содержит)
    array1[1] = 10;
    println(array1[1])

    val listOfNumbers1 = ArrayList<Int?>() // тут мы используем реализацию вместо абстракции, это не всегда удобно
    listOfNumbers1.add(null)
    listOfNumbers1.add(1)
    println(listOfNumbers1[1]) //к элементам arraylist можно обращаться как к массивам


    val listOfNumbers2: MutableList<Int?> = ArrayList<Int?>() // родительский тип коллекции и использование mutable чтобы
    //    можно было добавлять в и изменять лист
    listOfNumbers1.add(1)
    listOfNumbers1.add(2)



    //ЦИКЛЫ

//    val array = arrayOf(1,2,3,4,5)
//    for (i in array){
//        println(i)
//    }
//
//    val array5 = arrayOfNulls<Int?>(100)
//    for (i in 0..99){
//        array5[i] = i
//    }
//    for (i in 0 until array.size){
//        println(i)
//    }
//    for (i in 100 downTo 0 step 2){
//        println(i)
//    }


//    println("/n/n")
//    val array = arrayOfNulls<Int?>(5)
//    for (i in 0 until array.size){
//        array[i] = i*2
//    }
////    for ((index, i) in array.withIndex()){
////        array[index] = i?.times(2)
////    }
//    for (i in array){
//        println(i)
//    }

    //homework- циклы
    println("homework")
    val masHomework = arrayOfNulls<Int?>(301)
    for (i in 0..300){
        masHomework[i] = i+300
    }

    for((index, i) in (600 downTo 300).withIndex()){
        if (((i) % 5) == 0) {
            println(masHomework[index])
        }
    }

//    for((index, i) in masHomework.withIndex()){
//        println(masHomework[index])
//    }
}