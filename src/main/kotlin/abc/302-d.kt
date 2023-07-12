package abc

import java.util.*
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val d = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until m).map { sc.next().toLong() }
    println(problem302d(n, m, d, a, b))
}

fun problem302d(n: Int, m: Int, d: Long, a: List<Long>, b: List<Long>): Long {
    val a = a.sortedDescending()
    val b = b.sortedDescending()
    val da = ArrayDeque(a)
    val db = ArrayDeque(b)
    var ans = -1L
    while (da.isNotEmpty() && db.isNotEmpty()) {
        val maxA = da.peek()
        val maxB = db.peek()
        if  (Math.abs(maxA - maxB) <= d) {
            ans = maxA + maxB
            break
        }
        if (maxA > maxB) {
            da.poll()
        } else {
            db.poll()
        }
    }

    return ans
}