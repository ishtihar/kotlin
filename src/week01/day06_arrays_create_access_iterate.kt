package week01.day06

fun main() {
    val numbers = arrayOf(40, 10, 30, 20, 50)

    println("Array: ${numbers.joinToString()}")
    println("First: ${numbers[0]}, Last: ${numbers[numbers.lastIndex]}")

    var sum = 0
    for (value in numbers) {
        sum += value
    }
    println("Sum: $sum")

    // edge case: safe index access
    val index = 10
    if (index in numbers.indices) {
        println("Value at $index: ${numbers[index]}")
    } else {
        println("Invalid index: $index")
    }
}

/*
Solved Questions:
1. Created, accessed, and iterated array.
2. Small program: sum + boundary access.
3. Edge case handled: invalid index.
4. Readable loops and variable naming.
5. Tested with valid and invalid index.
*/
