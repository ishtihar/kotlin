package week01_basics

fun main () {
    val myAge=29
    val ageLong=myAge.toLong()
    val ageDouble=myAge.toDouble()
    val ageString=myAge.toString()

    println("original age : $myAge")
    println("double age : $ageDouble")
    println("Long age : $ageLong")


    val wrongText = "abc"

    // Safe way - agar convert nahi ho sakta to null deta hai
    val result = wrongText.toIntOrNull()

    if (result == null) {
        println("Ye text number nahi hai!")
    } else {
        println("Number mil gaya: $result")
    }
}