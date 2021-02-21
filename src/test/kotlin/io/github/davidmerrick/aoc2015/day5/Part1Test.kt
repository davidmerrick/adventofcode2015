package io.github.davidmerrick.aoc2015.day5

import io.github.davidmerrick.aoc2015.testutil.TestUtil.readLines
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class Part1Test {

    @Test
    fun `Check consecutives`(){
        val regex = Regex("([a-zA-Z])\\1")
        regex.containsMatchIn("aaa") shouldBe true
        regex.containsMatchIn("aba") shouldBe false
    }

    @Test
    fun `Examples`(){
        "ugknbfddgicrmopn".isNice() shouldBe true
        "aaa".isNice() shouldBe true
        "jchzalrnumimnmhp".isNice() shouldBe false
        "haegwjzuvuyypxyu".isNice() shouldBe false
        "dvszwmarrgswjxmb".isNice() shouldBe false
    }

    @Test
    fun `Part 1 input`(){
        val niceCount = readLines(this::class, "day5.txt")
            .filter { it.isNice() }
            .count()
        println(niceCount)
    }
}