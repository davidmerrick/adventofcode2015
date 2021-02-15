package io.github.davidmerrick.aoc2015.day2

import io.github.davidmerrick.aoc2015.testutil.TestUtil.parseInput
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class Part1Test {

    @Test
    fun `Example present`() {
        val present = Present(2, 3, 4)
        present.surfaceArea() shouldBe 52
        present.smallestSideArea() shouldBe 6
    }

    @Test
    fun `Part 1 input`() {
        val sum = parseInput(this::class, "day2.txt") {
            it.split("x").map { side -> side.toInt() }
        }.map { Present(it[0], it[1], it[2]) }
            .sumBy { it.smallestSideArea() + it.surfaceArea() }
        println(sum)
    }
}