package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { (0 until w).map { sc.next().toLong() }  }
    println(problem224b(h, w, a))
}

fun problem224b(h: Int, w: Int, a: List<List<Long>>): String {
    for (i1 in 0 until h) {
        for (i2 in i1 + 1 until h) {
            for (j1 in 0 until w) {
                for (j2 in j1 + 1 until w) {
                    if (!(a[i1][j1] + a[i2][j2] <= a[i2][j1] + a[i1][j2])) {
                        return "No"
                    }
                }
            }
        }
    }
    return "Yes"
}