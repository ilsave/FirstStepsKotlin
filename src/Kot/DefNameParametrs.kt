package Kot

fun main() {
    printInfo("Gushin","Ilya", "")
    printInfo("Guschin", "Vladimir")
    printInfo(patronymic = "Leninovich ")
}

fun printInfo(lastname : String="", name: String="", patronymic: String = ""){
    if (lastname.isNotEmpty()) {
        println("Фамилия $lastname")
    }
    if (name.isNotEmpty()) {
        println("Имя $name")
    }
    if (patronymic.isNotEmpty()){
        println("Отчество: $patronymic")
    }
}

fun printInfo(lastname : String, name: String){
    printInfo(lastname, name, "")
}

fun volume(a : Int, b: Int, c: Int): Int = a * b * c