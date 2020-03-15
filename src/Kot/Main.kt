package Kot

private var name: String? = null
fun main() {
    println("Hello world!")
    val age: Int
    //println(name!!.length)// значит что я уверен что переменная не может хранить нулл
    //println(name?.length)//знак вопроса это проверка на нулл, если нулл то не выведет, иначе выведет
    val lengh = name?.length?:0
    println(lengh)

    //Homework1
    /*
    val str1: String? = "hey there"
    val str2: String? = "how is your life going"
    val str3: String? = "I dont know/ its alright"
    val count = (str1?.length?:0) + (str2?.length?:0) + (str3?.length?:0)
    println("number of symbols = " + count)
    println(str1?.length?:0)
    println(str2?.length?:0)
    println(str3?.length?:0)
     */
    var a = 50
    val food: String = if (a < 40){
        a++
       "123"
    } else if (a < 60){
        a += 4
        "123"
    } else {
        a +=3
        "null che to tam"
    }

    println("ниче себе, твоя еда food = ${food.length} and $a rubles ")
    // ${} -  в них у объектов можем вызывать методы

    val nameOfMonth = "July"
    //перечислять можем даже цифры (например диапозон чисел можно задать как in 3..5 - значит цифры от 3 до 5)
    val season : String = when(nameOfMonth){
        "December", "Janenary", "Febrary" ->  {
            "winter"
        }
        "Jyne", "July", "August" -> {
            "summer"
        }
        else -> {
            "has not found"
        }
    }
    println("well, season is... $season")

    val temp = 90
    val state = when {
        temp < 0 -> "temp < 0"
        temp in 0..100 -> {
            println("temp > 10")
        "temp is in 0..100"}
        else  -> "some tempeture"
    }
    println("state of water is $state")

    //last homework
    val n = 10
    val whether: Boolean = false
    val action: String = when {
        n in 10..15 && whether -> "walk"
        n in 15..20 && !whether -> "read the book"
        n in 20..24 || n in 0..9 -> "sleep!"
        else -> "i dont know what u shd do/ learn kotlin"
    }
    println("your action is.. $action")
}

