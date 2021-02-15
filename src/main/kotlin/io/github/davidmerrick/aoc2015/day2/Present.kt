package io.github.davidmerrick.aoc2015.day2

data class Present(val length: Int, val width: Int, val height: Int) {

    private val shortestSides: Pair<Int, Int> by lazy {
        val sorted = listOf(length, width, height)
            .sorted()
        Pair(sorted.first(), sorted[1])
    }

    fun surfaceArea(): Int {
        return 2 * length * width + 2 * width * height + 2 * length * height
    }

    fun smallestSideArea(): Int {
        return shortestSides.first * shortestSides.second
    }

    fun smallestPerimeter(): Int {
        return shortestSides.first * 2 + shortestSides.second * 2
    }

    fun cubicFeet(): Int {
        return length * width * height
    }
}
