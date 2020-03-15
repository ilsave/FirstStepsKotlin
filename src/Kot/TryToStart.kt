package Kot

private var name: String? = null
//то есть потом может быть изменена, то явно указываем сначала что может быть null
class TryToStart {
    fun main(args: Array<String>) {
        println(name!!.length)
    }
}