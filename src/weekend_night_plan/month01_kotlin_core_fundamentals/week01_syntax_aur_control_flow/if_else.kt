package weekend_night_plan.month01_kotlin_core_fundamentals.week01_syntax_aur_control_flow


fun main() {
    //Positive and negative number checker
//    val num = -12
//    if (num >= 0) {
//        println("Positive Number")
//    } else {
//        println("Negative Number")
//    }
    //Even and odd number checker
//    val checkNum=15
//    if (checkNum%2==0){
//        println("Even Number")
//    } else{
//        println("Odd Number")
//
//    }
    // app rating
    val ratings=5
    if (ratings == 5){
        println("Excellent")
    }else if (ratings==4){
        println("Very Good")
    } else if (ratings==3){
        println("Good")
    }else if (ratings==2){
        println("Poor")
    }else if (ratings==1){
        println("Bad")
    }
    else {
        println("invalid rating")
    }
}