package abc

import utilities.debugLog
import java.util.*


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem271c(n, a))
}

fun problem271c(n: Int, a: List<Long>): Long {
    a.sorted()
    var dupCunt = 0
    var current = 0L
    for (i in 0 until n) {
        if (current == a[i]) {
            dupCunt++
        }
        current = a[i]
    }
    val a = a.toSet().toList()
    val deq = ArrayDeque<Long>(a)
    var currentI = 0L
    var i = 0
    while (i < a.size) {
        if (deq.isEmpty()) {
            if (dupCunt >= 2) {
                dupCunt -= 2
                currentI++
                continue
            } else {
                break
            }
        }
        val first = deq.first
        if (currentI + 1 == first) {
            deq.pollFirst()
            currentI++
            continue
        }
        if (dupCunt >= 2) {
            dupCunt -= 2
            currentI++
            continue
        }
        if (deq.size >= 2) {
            deq.pollLast()
            deq.pollLast()
            currentI++
            continue
        }
        if (deq.size == 1) {
            if (dupCunt >= 2) {
                dupCunt -= 2
                currentI++
                continue
            }
        }
        i++
    }
    if(dupCunt == 1 && deq.size == 1) {
        dupCunt--
        deq.pollLast()
        currentI++
    }
    return currentI
}