package week01.day02

fun main() {
    println("Day 02 Solution: Syntax + Top-level functions")
    println("5 + 7 = ${add(5, 7)}")
    println("Status for 19 = ${votingStatus(19)}")
    println("Status for -1 = ${votingStatus(-1)}") // edge case
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun votingStatus(age: Int): String {
    if (age < 0) return "Invalid age"
    return if (age >= 18) "Eligible" else "Not eligible"
}

/*
Solved Questions:
1. Syntax and top-level functions shown via add() and votingStatus().
2. Small program: voter eligibility checker.
3. Edge case handled: negative age.
4. Readability: functions are short and single-purpose.
5. Tested with ages 19, 15, and -1.
*/
