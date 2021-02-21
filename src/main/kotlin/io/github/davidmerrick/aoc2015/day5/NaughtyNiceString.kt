package io.github.davidmerrick.aoc2015.day5

private val badSubstrings = setOf("ab", "cd", "pq", "xy")
private val vowels = setOf('a', 'e', 'i', 'o', 'u')
private val consecutives = Regex("([a-zA-Z])\\1")

fun String.isNice(): Boolean {
    // Check vowels
    if (this.filter { it in vowels }.count() < 3)
        return false

    // Check consecutives
    if (!consecutives.containsMatchIn(this))
        return false

    // Check bad pairs
    badSubstrings.forEach {
        if(this.contains(it)) return false
    }

    return true
}