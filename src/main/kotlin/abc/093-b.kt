package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val k = sc.nextLong()
    println(problem093b(a, b, k))
}

fun problem093b(a: Long, b: Long, k: Long): String {
    val answers = mutableListOf<Long>()
    for (i in 0 until k) {
        val ai = a + i
        val bi = b - i
        if (ai == bi) {
            answers.add(ai)
            break
        }
        if (ai > bi) {
            break
        }
        answers.add(ai)
        answers.add(bi)
    }
    return answers.sorted().joinToString("\n")
}