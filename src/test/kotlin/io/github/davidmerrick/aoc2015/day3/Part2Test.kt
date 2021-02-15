package io.github.davidmerrick.aoc2015.day3

import io.github.davidmerrick.aoc2015.testutil.TestUtil
import org.junit.jupiter.api.Test

class Part2Test {

    @Test
    fun `Part 2 full`() {
        val santa = HouseVisitor()
        val roboSanta = HouseVisitor()
        val input = TestUtil.readText(this::class, "day3.txt")
        input.forEachIndexed { i, direction ->
            if (i % 2 == 0) {
                roboSanta.visit(direction)
            } else {
                santa.visit(direction)
            }
        }

        // Union the sets
        val union = santa.visited.keys.union(roboSanta.visited.keys)
        println("Visited ${union.count()} houses at least once")
    }
}