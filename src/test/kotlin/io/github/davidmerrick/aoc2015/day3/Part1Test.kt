package io.github.davidmerrick.aoc2015.day3

import io.github.davidmerrick.aoc2015.testutil.TestUtil.readText
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class Part1Test {

    @Test
    fun `Example input`(){
        val houseVisitor = HouseVisitor()
        houseVisitor.visit('<')
        houseVisitor.visited.count() shouldBe 2
    }

    @Test
    fun `Example input 2`(){
        val houseVisitor = HouseVisitor()
        val input = "^>v<"
        input.forEach { houseVisitor.visit(it) }
        houseVisitor.visited.count() shouldBe 4
        houseVisitor.visited[Pair(0,0)] shouldBe 2
    }

    @Test
    fun `Part 1 full`(){
        val houseVisitor = HouseVisitor()
        val input = readText(this::class, "day3.txt")
        input.forEach { houseVisitor.visit(it) }
        println("Visited ${houseVisitor.visited.count()} houses at least once")
    }
}