package io.github.davidmerrick.aoc2015.day4

import org.junit.jupiter.api.Test

class Part2Test {

    @Test
    fun `Part 2 input`(){
        val hashFinder = HashFinder("iwrupvqb")
        println(hashFinder.find("000000"))
    }
}