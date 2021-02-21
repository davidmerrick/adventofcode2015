package io.github.davidmerrick.aoc2015.day4

import java.math.BigInteger
import java.security.MessageDigest

private const val LIMIT = 1_000_000_000L
private const val HASH_LENGTH = 32

class HashFinder(private val key: String) {
    fun find(prefix: String = "00000"): Long {
        for (i in 0..LIMIT) {
            val hash = computeHash("$key$i")
            if (hash.startsWith(prefix)) {
                return i
            }
        }
        throw RuntimeException("Hash not found")
    }

    companion object {
        private val md: MessageDigest = MessageDigest.getInstance("MD5")
        fun computeHash(input: String): String {
            return BigInteger(1, md.digest(input.toByteArray()))
                .toString(16)
                .padStart(HASH_LENGTH, '0')
        }
    }
}