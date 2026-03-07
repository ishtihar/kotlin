package week01.day07

fun main() {
    val data = arrayOf(9, 3, 7, 1, 5)
    println("Original: ${data.joinToString()}")

    val sortedAsc = data.sortedArray()
    val sortedDesc = data.sortedArrayDescending()
    println("Sorted ASC: ${sortedAsc.joinToString()}")
    println("Sorted DESC: ${sortedDesc.joinToString()}")

    val target1 = 7
    val target2 = 100
    println("Search $target1 -> ${search(data, target1)}")
    println("Search $target2 -> ${search(data, target2)}") // edge case: not found
}

fun search(arr: Array<Int>, target: Int): String {
    for (i in arr.indices) {
        if (arr[i] == target) return "Found at index $i"
    }
    return "Not found"
}

/*
Solved Questions:
1. Built array search and sort mini tool.
2. Added ascending and descending sort examples.
3. Edge case handled: value not found.
4. Reusable function search() for readability.
5. Tested with targets 7 (found) and 100 (not found).
*/
