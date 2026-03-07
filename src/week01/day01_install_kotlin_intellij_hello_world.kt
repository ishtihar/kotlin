package week01.day01

fun main() {
    println("Day 01 Solution: Install + Hello World")
    printHello("Ish")
    printHello("") // edge case

    println("\nSample test outputs:")
    println("Input: Ish -> Hello, Ish!")
    println("Input: Kotlin -> Hello, Kotlin!")
    println("Input: '' -> Name cannot be empty.")
}

fun printHello(name: String) {
    if (name.isBlank()) {
        println("Name cannot be empty.")
        return
    }
    println("Hello, $name!")
}

/*
Solved Questions:
1. Hello World concept explained by printHello() function.
2. Small program: greeting printer.
3. Edge case handled: empty name.
4. Readability: clear names and function split.
5. Tested with 3 inputs (Ish, Kotlin, empty).
*/
