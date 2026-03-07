package week01.day04

fun main() {
    val intValue = 25
    val inferredDouble = 12.75 // inferred type Double

    val convertedDouble: Double = intValue.toDouble()
    val convertedInt: Int = inferredDouble.toInt()

    println("Int to Double: $intValue -> $convertedDouble")
    println("Double to Int: $inferredDouble -> $convertedInt")

    // edge case: invalid number parsing
    val rawInput = "12a"
    val parsed = rawInput.toIntOrNull()
    println("Parsed '$rawInput': ${parsed ?: "Invalid number"}")
}

/*
Solved Questions:
1. Type inference shown with inferredDouble.
2. Type conversion shown with toDouble() and toInt().
3. Edge case handled using toIntOrNull().
4. Readable naming and output formatting.
5. Tested valid conversion + invalid parse.
*/
