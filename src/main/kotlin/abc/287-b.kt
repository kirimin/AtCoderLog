package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    val t = (0 until m).map { sc.next() }
    println(problem287b(n, m, s, t))
}

fun problem287b(n: Int, m: Int, s: List<String>, t: List<String>): Int {
    var count = 0
    for (i in 0 until n) {
        val si = s[i]
        for (j in 0 until m) {
            val tj = t[j]
            if (si.takeLast(3) == tj) {
                count++
                break
            }
        }
    }
    return count
}