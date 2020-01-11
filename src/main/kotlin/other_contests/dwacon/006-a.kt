package other_contests.dwacon

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val st = (0 until n).map { sc.next() to sc.next().toInt()  }
    val x = sc.next()
    println(problem006a(n, st, x))
}

fun problem006a(n: Int, st: List<Pair<String, Int>>, x: String): Int {
    var sum = 0
    var start = false
    for (i in 0 until n) {
        if (start) {
            sum += st[i].second
        }
        if (st[i].first == x) start = true
    }
    return sum
}