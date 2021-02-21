package io.github.davidmerrick.aoc2015.day4

import io.kotlintest.matchers.string.shouldStartWith
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test

class Part1Test {

    @Test
    fun `GetHash test`(){
        val hash = HashFinder.computeHash("abcdef609043")
        hash shouldStartWith "000001dbbfa"
    }

    @Test
    fun `Example input`(){
        val hashFinder = HashFinder("abcdef")
        hashFinder.find() shouldBe 609043L
    }

    @Test
    fun `Part 1 input`(){
        val hashFinder = HashFinder("iwrupvqb")
        println(hashFinder.find())
    }
}