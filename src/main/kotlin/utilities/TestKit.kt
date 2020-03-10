package utilities

import java.io.File
import java.util.*
import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.random.nextLong

fun toLongList(str: String) = str.split(" ").map { it.toLong() }

fun toIntList(str: String) = str.split(" ").map { it.toInt() }

fun createIntegerTestData(n: Long, range: IntRange): List<Int> {
    return (0 until n).map { Random.nextInt(range) }
}

fun createLongTestData(n: Long, range: LongRange): List<Long> {
    return (0 until n).map { Random.nextLong(range) }
}

fun createStringTestData(n: Long, range: IntRange): List<String> {
    return (0 until n).map { UUID.randomUUID().toString().take(Random.nextInt(range)) }
}

fun testDataCreateExample(): String {
    val pow = Math.pow(10.0, 6.0).toInt()
    val n = pow
    val range = (0 until pow)
    val a = createIntegerTestData(n.toLong(), range)
    val s = "$n\n"
    return s + a.joinToString("\n")
}

fun main() {
    val file = File(".\\src\\main\\kotlin\\utilities\\textdata.txt")
    if (!file.exists()) {
        file.delete()
        file.createNewFile()
    }
    file.writeText(testDataCreateExample())
}