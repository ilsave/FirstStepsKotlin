package Kot

fun main() {
    val result = modifyString("hello world") {it.toUpperCase()}
    println(result)
    val col = (0..10).toMutableList()
    modifyCollecton(col){
        println(col.sum())
    }
}

inline fun modifyCollecton(col: MutableList<Int>, modifyCol: (MutableList<Int>) -> Unit){
    modifyCol(col)
}

inline fun modifyString(string:String, modify: (String) -> String): String {
    return modify(string)
}
//описание функции modify наверху принимает тип стринг и возвращает стринг