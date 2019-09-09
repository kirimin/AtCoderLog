package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val a = (0 until n).map { Class061c(sc.next().toInt(), sc.next().toInt()) }
    println(problem061c(n, k, a))
}

fun problem061c(n: Int, k: Long, a: List<Class061c>): Int {
    val a2 = a.sortedBy { it.a }
    var k2 = k
    var ans = 0
    for (i in 0 until n) {
        val tmp = a2[i].b
        if (tmp < k2) {
            k2 -= tmp
        } else {
            ans = a2[i].a
            break
        }
    }
    return ans
}

data class Class061c(var a: Int, var b: Int)