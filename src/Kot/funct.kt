package Kot

fun main() {
    println(max(5, 10))
    println(line("he"))
    println(sum())
    val numbers = arrayOf(1,2,3,90,5,6)
    val result = sort(numbers)
    for (i in result){
        println(i)
    }
}

fun max(a: Int, b: Int): Int = if (a > b)  a  else  b

fun line(s : String) = s.substring(0,Math.min(5, s.length))

fun sum(vararg numbers: Int): Int {// входные данные переменной длины
    var result = 0
    for (num in numbers){
        result += num
    }
    return result
}

fun sort(numbers: MutableList<Int>): List<Int>{
    for (i in 0 until numbers.size){
        for (j in numbers.size - 1 downTo i){
            if (numbers[j] < numbers[j-i]){
                val temp = numbers[j]
                numbers[j] = numbers[j-1]
                numbers[j-1]=temp
            }
        }
    }
    return numbers
}

fun sort (numbers: Array<Int>) = sort(numbers.toMutableList())
fun sort (vararg  numbers: Int) = sort(numbers.toMutableList())
