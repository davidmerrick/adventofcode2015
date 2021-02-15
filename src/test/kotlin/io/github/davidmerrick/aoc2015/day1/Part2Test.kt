package io.github.davidmerrick.aoc2015.day1

import io.github.davidmerrick.aoc2015.testutil.TestUtil.readText
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class Part2Test {

    @Test
    fun `With test inputs`() {
        FloorCounter.enteredBasement(")") shouldBe 1
        FloorCounter.enteredBasement("()())") shouldBe 5
    }

    @Test
    fun `Part 2 with input`() {
        val input = readText(this::class, "day1.txt")
        println(FloorCounter.enteredBasement(input))
    }
}