package io.github.davidmerrick.aoc2015.day1

import java.util.Stack

object FloorCounter {
    fun count(input: String) = input
        .map { if (it == '(') 1 else -1 }
        .sum()

    /**
     * Returns 1-indexed position at which
     * Santa entered the basement
     */
    fun enteredBasement(input: String): Int {
        val openParens = Stack<Char>()

        for (i in input.indices) {
            val current = input[i]
            if (current == '(') {
                openParens.push(current)
            } else {
                if (openParens.isEmpty()) {
                    return i + 1 // solution is 1-indexed
                }
                openParens.pop()
            }
        }
        throw RuntimeException("D'oh. Santa never entered the basement.")
    }
}