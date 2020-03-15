package Kot

var nameFun: String? = "123r234"

val listhom: MutableList<Int>? = mutableListOf()

fun main() {
    val list = mutableListOf<Int>()
    with (list){
        for(i in 0 until 1000){
            add((Math.random() * 100).toInt())
        }
        println(sum())
        println(average())
        println(min())
        println(max())
        println(last())
        println(first())

    }
    nameFun?.let {
        if (it.length > 5){
            println("123")
        }
    }

    //домашка
    listhom?.let {
        with(listhom){
            for (list1 in 0 until 10 ){
                add((Math.random() * 100).toInt())
            }
            val result =  filter { it % 2 == 0 }.take(100)
            for(i in result){
                println(i)
            }
        }
    }

}