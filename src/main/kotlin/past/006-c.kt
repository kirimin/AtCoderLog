package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val k = (0 until n).map { val c = sc.next().toInt(); (0 until c).map { sc.next().toInt() } }
    val p = sc.nextInt()
    val q = sc.nextInt()
    val b = (0 until p).map { sc.next().toInt() }
    println(problem006c(n, m, k, p, q, b))
}

fun problem006c(n: Int, m: Int, k: List<List<Int>>, p: Int, q: Int, b: List<Int>): Int {
    var count = 0
    for (i in 0 until n) {
        val ki = k[i]
        var count2 = 0
        for (j in 0 until ki.size) {
            val kij = ki[j]
            if (b.contains(kij)) count2++
        }
        if (count2 >= q) count++
    }
    return count
}