package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem237d(n, s))
}

fun problem237d(n: Int, s: String): String {
    val route = LinkedList<Int>()
    route.add(0)
    var current = 0
    for (i in 0 until n) {
        val si = s[i]
        if (si == 'R') {
            current++
        }
        route.add(current, i + 1)
    }
    return route.toArray().joinToString(" ")
}