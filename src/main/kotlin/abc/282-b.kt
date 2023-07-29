package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem282b(n, m, s))
}

fun problem282b(n: Int, m: Int, s: List<String>): Int {
    var count = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val list = mutableListOf<Boolean>()
            for (k in 0 until m) {
                val c1 = s[i][k]
                val c2 = s[j][k]
                if (c1 == 'o' || c2 == 'o') {
                    list.add(true)
                } else {
                    list.add(false)
                }
            }
            if (list.all { it }) {
                count++
            }
        }
    }
    return count
}