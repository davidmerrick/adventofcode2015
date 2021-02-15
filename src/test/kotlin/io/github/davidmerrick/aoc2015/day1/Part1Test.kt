package io.github.davidmerrick.aoc2015.day1

import io.github.davidmerrick.aoc2015.testutil.TestUtil.readText
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class Part1Test {

    @Test
    fun `With test inputs`(){
        FloorCounter.count("(())") shouldBe 0
        FloorCounter.count("()()") shouldBe 0
    }

    @Test
    fun `Part 1 with input`(){
        val input = readText(this::class, "day1.txt")
        println(FloorCounter.count(input))
    }
}