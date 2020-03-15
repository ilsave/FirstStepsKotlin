package Kot

fun main() {
    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..10){
        names.add("Name$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    val users = names.zip(phones)
    for(user in users){
        println("Name ${user.first} Phonenumber: ${user.second}")
    }

    val fullnames = mutableListOf<String>()
    for(i in 0..10){
        fullnames.add("Name:$i  Lastname:$i")
    }
    val names1 = fullnames.map{it.substringBefore(" ")}
    val lastnames1 = fullnames.map{it.substringAfter(" ")}
    println(names1)
    println(lastnames1)
    val users1 = names1.zip(lastnames1)
    println(users1)
}