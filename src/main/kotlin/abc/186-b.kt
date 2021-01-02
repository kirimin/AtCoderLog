package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { (0 until w).map { sc.next().toInt() }  }
    println(problem186b(h, w, a))
}

fun problem186b(h: Int, w: Int, a: List<List<Int>>): Int {
    val min = a.minBy { it.min()!! }!!.min()!!
    var ans = 0
    for (i in 0 until h) {
        for (j in 0 until w) {
            val aij = a[i][j]
            ans += aij - min
        }
    }
    return ans
}