package week01.day05

fun main() {
    val a = 12
    val b = 5

    println("Arithmetic: + ${a + b}, - ${a - b}, * ${a * b}, / ${a / b}, % ${a % b}")
    println("Logical: (a > 10 && b < 10) = ${a > 10 && b < 10}")
    println("Bitwise: a and b = ${a and b}, a or b = ${a or b}, a xor b = ${a xor b}")

    // edge case: divide by zero
    val divisor = 0
    if (divisor == 0) {
        println("Cannot divide by zero")
    } else {
        println(a / divisor)
    }
}

/*
Solved Questions:
1. Arithmetic/logical/bitwise operators demonstrated.
2. Small operator demo program created.
3. Edge case handled: divide by zero.
4. Readable grouped outputs.
5. Tested with positive numbers and divisor=0 case.
*/
