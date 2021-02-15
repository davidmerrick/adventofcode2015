package io.github.davidmerrick.aoc2015.day2

import io.github.davidmerrick.aoc2015.testutil.TestUtil.parseInput
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class Part2Test {

    @Test
    fun `Example present`() {
        val present = Present(2, 3, 4)
        present.smallestPerimeter() shouldBe 10
        present.cubicFeet() shouldBe 24
    }

    @Test
    fun `Part 2 input`() {
        val sum = parseInput(this::class, "day2.txt") {
            it.split("x").map { side -> side.toInt() }
        }.map { Present(it[0], it[1], it[2]) }
            .sumBy { it.cubicFeet() + it.smallestPerimeter() }
        println(sum)
    }
}