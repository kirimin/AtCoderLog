package typical90

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = sc.nextLong()
    val q = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem055(n, p, q, a))
}

fun problem055(n: Int, p: Long, q: Long, a: List<Long>): Long {
    var count = 0L
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val ij = a[i] * a[j] % p
            for (k in j + 1 until n) {
                val ijk = ij * a[k] % p
                for (l in k + 1 until n) {
                    val ijkl = ijk * a[l] % p
                    for (m in l + 1 until n) {
                        if (ijkl * a[m] % p == q) {
                            count++
                        }
                    }
                }
            }
        }
    }
    return count
}