package week01.day03

fun main() {
    val studentName: String = "Ish"
    var age: Int = 20
    val marks: Double = 88.5
    val isEnrolled: Boolean = true
    val grade: Char = 'A'

    println("Before update -> Name: $studentName, Age: $age")
    age = 21
    println("After update  -> Name: $studentName, Age: $age")
    println("Marks: $marks, Enrolled: $isEnrolled, Grade: $grade")

    // edge case: invalid age value
    val inputAge = -2
    if (inputAge < 0) {
        println("Invalid age: $inputAge")
    }
}

/*
Solved Questions:
1. Used val/var and common data types.
2. Small profile program created.
3. Edge case handled: negative age check.
4. Clear variable names and aligned output.
5. Tested update flow and invalid age case.
*/
