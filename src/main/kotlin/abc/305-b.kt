package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val p = sc.next()
    val q = sc.next()
    println(problem305b(p, q))
}

fun problem305b(p: String, q: String): Int {
    val distance = intArrayOf(0, 3, 1, 4, 1, 5, 9)
    var sum = 0
    if (p == "F") {
        sum += distance[6]
    } else if (p == "E") {
        sum += distance[5] + distance[6]
    } else if (p == "D") {
        sum += distance[4] + distance[5] + distance[6]
    } else if (p == "C") {
        sum += distance[3] + distance[4] + distance[5] + distance[6]
    } else if (p == "B") {
        sum += distance[2] + distance[3] + distance[4] + distance[5] + distance[6]
    } else if (p == "A") {
        sum += distance[1] + distance[2] + distance[3] + distance[4] + distance[5] + distance[6]
    }
    if (q == "F") {
        sum -= distance[6]
    } else if (q == "E") {
        sum -= distance[5] + distance[6]
    } else if (q == "D") {
        sum -= distance[4] + distance[5]+ distance[6]
    } else if (q == "C") {
        sum -= distance[3] + distance[4] + distance[5]+ distance[6]
    } else if (q == "B") {
        sum -= distance[2] + distance[3] + distance[4] + distance[5]+ distance[6]
    } else if (q == "A") {
        sum -= distance[1] + distance[2] + distance[3] + distance[4] + distance[5]+ distance[6]
    }
    return Math.abs(sum)
}