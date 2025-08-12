import java.util.Scanner

/**
 * A simple command-line calculator that performs basic arithmetic operations.
 *
 * The program prompts the user for two numbers and an operator. Supported
 * operators are `+`, `-`, `*`, and `/`. Division by zero is checked and will
 * result in a message instead of an exception.
 */
fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter first number: ")
    val first = scanner.nextDouble()

    print("Enter operator (+, -, *, /): ")
    val operator = scanner.next()

    print("Enter second number: ")
    val second = scanner.nextDouble()

    val result = when (operator) {
        "+" -> first + second
        "-" -> first - second
        "*" -> first * second
        "/" ->
            if (second != 0.0) first / second else {
                println("Cannot divide by zero.")
                return
            }
        else -> {
            println("Unsupported operator: $operator")
            return
        }
    }

    println("Result: $result")
}

