package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val q = sc.nextInt()
    val s = (0 until q).map {
        val num = sc.next().toInt()
        if (num == 1) {
            intArrayOf(num, sc.next().toInt())
        } else {
            intArrayOf(num, sc.next().toInt(), sc.next().toInt())
        }
    }
    println(problem3b(n, m, q, s))
}

fun problem3b(n: Int, m: Int, q: Int, s: List<IntArray>): String {
    val res = mutableListOf<Int>()
    val users = Array(n) { Array(m) { false } }
    val scores = IntArray(m) { n }
    for (i in 0 until s.size) {
        val si = s[i]
        when (si[0]) {
            1 -> {
                val user = users[si[1] - 1]
                var sum = 0
                for (j in 0 until m) {
                    val uj = user[j]
                    if (uj) {
                        sum += scores[j]
                    }
                }
                res.add(sum)
            }
            2 -> {
                scores[si[2] - 1] -= 1
                val user = users[si[1] - 1]
                val problem = si[2] - 1
                user[problem] = true
            }
        }
    }

    return res.joinToString("\n")
}