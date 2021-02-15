package io.github.davidmerrick.aoc2015.day3

class HouseVisitor {

    private var x: Int = 0
    private var y: Int = 0

    // Map of visited houses to count
    private val _visited = mutableMapOf<Pair<Int, Int>, Int>()
    val visited
        get() = _visited.toMap()

    init {
        _visited[Pair(x, y)] = 1
    }

    fun visit(direction: Char) {
        when (direction) {
            '<' -> x--
            '>' -> x++
            '^' -> y++
            'v' -> y--
        }
        _visited.compute(Pair(x, y)) { _, value -> (value ?: 0) + 1 }
    }

}