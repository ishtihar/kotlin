package week01_basics

import com.sun.tools.javac.Main

class Mobile {

    var company: String =""
    var model: String=""

    fun whichmobie () {

        println("$company")
        println("$model")

    }

}

fun main ()
{
    var mobile = Mobile()
    mobile.company="Samsung"
    mobile.model="Galaxy S3 pro"
    mobile.whichmobie()
}

