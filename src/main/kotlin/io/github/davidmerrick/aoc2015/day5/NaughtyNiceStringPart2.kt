package io.github.davidmerrick.aoc2015.day5

import java.util.Stack

// Strings like "aba", "xyx"
private val sandwiches = Regex("([a-zA-Z])[a-zA-Z]\\1")

fun getPairs(input: String): Set<String> {
    val pairs = mutableSetOf<String>()
    val charStack = Stack<Char>()
    for (char in input) {
        if (charStack.isEmpty()) {
            charStack.push(char)
            continue
        }
        val previous = charStack.pop()
        pairs.add("$previous$char")
        charStack.push(char)
    }
    return pairs.toSet()
}

/**
 * Returns number of non-overlapping
 * pairs in the string
 */
fun pairCount(input: String): Int {
    var pairCount = 0
    getPairs(input).forEach {
        if (input.contains(it)) {
            val replaced = input.replaceFirst(it, "")
            if (replaced.contains(it)) pairCount++
        }
    }
    return pairCount
}

fun String.isNicePart2(): Boolean {
    if (pairCount(this) == 0)
        return false

    if (!sandwiches.containsMatchIn(this))
        return false

    return true
}