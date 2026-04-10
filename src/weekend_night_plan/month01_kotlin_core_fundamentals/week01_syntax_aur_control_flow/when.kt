package weekend_night_plan.month01_kotlin_core_fundamentals.week01_syntax_aur_control_flow

fun main() {
//   val day=2
//    when (day){
//        1-> println("Monday")
//        2-> println("Tuesday")
//        3-> println("Wednesday")
//        else -> println("Invalid day")
//
//    }
    //Task 1: Even-Odd Checker
//    val num=8
//   val checker= when {
//       (num % 2 == 0) -> "even"
//       else -> "odd"
//   }
//    println(checker)

//Task 2: Grade Checker
    val marks=87
//    val result=when {
//        (marks>=90) ->println("A")
//        (marks>=75)->println("B")
//        (marks>=50)->println("C")
//        else -> println("Fail")
//    }
   when(marks) {
       in 90..100 -> println("A")
       in 75..89 -> println("B")
       in 50..74 -> println("C")
       else -> println("Fail")
   }
}