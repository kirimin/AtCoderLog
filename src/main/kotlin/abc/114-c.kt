package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem114c(n))
}

fun problem114c(n: Long): Long {
    var count = 0L
    fun counter(current: Long, use: Long, used: HashSet<Long>) {
        if (current > n) return
        used.add(use)
        if (used.contains(3) && used.contains(5) && used.contains(7)) {
            count++
        }

        counter(current * 10 + 7, 7, HashSet(used))
        counter(current * 10 + 5, 5, HashSet(used))
        counter(current * 10 + 3, 3, HashSet(used))
    }

    counter(0L, 0, HashSet())
    return count
}