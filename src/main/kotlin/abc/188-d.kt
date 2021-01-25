package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val c = sc.nextLong()
    val abc = (0 until n).map { Triple(sc.next().toLong(), sc.next().toLong(), sc.next().toLong()) }
    println(problem188d(n, c, abc))
}

fun problem188d(n: Int, c: Long, abc: List<Triple<Long, Long, Long>>): Long {
    val events = mutableListOf<Pair<Long, Long>>()
    for (i in 0 until n) {
        val (a, b, c) = abc[i]
        events.add(a - 1 to c)
        events.add(b to -c)
    }
    val eventsS = events.sortedBy { it.first }
    var sum = 0L
    var currentDay = 0L
    var currentCost = 0L
    for (i in 0 until eventsS.size) {
        val event = eventsS[i]
        val days = event.first - currentDay
        try {
            sum += Math.min(c * days, Math.multiplyExact(currentCost, days))
        } catch (e : Exception) {
            sum += c * days
        }
        currentDay = event.first
        currentCost += event.second
    }
    return sum
}