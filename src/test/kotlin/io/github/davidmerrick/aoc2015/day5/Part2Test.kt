package io.github.davidmerrick.aoc2015.day5

import io.github.davidmerrick.aoc2015.testutil.TestUtil
import io.kotlintest.matchers.collections.shouldContain
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class Part2Test {

    @Test
    fun `Check sandwiches`() {
        val regex = Regex("([a-zA-Z])[a-zA-Z]\\1")
        regex.containsMatchIn("aba") shouldBe true
        regex.containsMatchIn("aaa") shouldBe true
        regex.containsMatchIn("abb") shouldBe false
    }

    @Test
    fun `Check unique pairs`() {
        val input = "aabcdefgaa"
        getPairs(input) shouldContain "aa"
        uniquePairCount(input) shouldBe 1
    }

    @Test
    fun `Check unique pairs 2`() {
        val input = "qjhvhtzxzqqjkmpb"
        getPairs(input) shouldContain "qj"
        uniquePairCount(input) shouldBe 1
    }

    @Test
    fun `Check unique pairs 3`() {
        val input = "uurcxstgmygtbstg"
        getPairs(input) shouldContain "tg"
        uniquePairCount(input) shouldBe 2
    }

    @Test
    fun `Check unique pairs 4`() {
        val input = "ieodomkazucvgmuy"
        uniquePairCount(input) shouldBe 0
    }

    @Test
    fun `Examples`() {
        "qjhvhtzxzqqjkmpb".isNicePart2() shouldBe true
        "xxyxx".isNicePart2() shouldBe true
        "uurcxstgmygtbstg".isNicePart2() shouldBe false
        "ieodomkazucvgmuy".isNicePart2() shouldBe false
        "aaa".isNicePart2() shouldBe false
    }

    // Todo: 73 is incorrect, apparently
    @Test
    fun `Part 2 input`() {
        val niceCount = TestUtil.readLines(this::class, "day5.txt")
            .filter { it.isNicePart2() }
            .count()
        println(niceCount)
    }
}