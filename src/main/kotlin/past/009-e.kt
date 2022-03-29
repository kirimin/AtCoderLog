package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next()
    println(problem009e(n))
}

fun problem009e(n: String): Long {
    val left = charArrayOf('1', '2','3', '4', '5')
    var time = 0L
    time += 500
    var prev = n[0]
    for (i in 1 until n.length) {
        if (n[i] == prev) {
            time += 301
        } else if ((left.contains(n[i]) && left.contains(prev)) ||
            (!left.contains(n[i]) && !left.contains(prev))) {
            time += 210
        } else {
            time += 100
        }
        prev = n[i]
    }
    return time
}
