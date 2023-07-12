package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem301b(n, a))
}

fun problem301b(n: Int, a: List<Int>): String {
    var ans = mutableListOf<Int>()
    for (i in 0 until n) {
        val ai = a[i]
        if (i == n - 1) {
            ans.add(ai)
            break
        }
        val ai2 = a[i + 1]
        if (ai == ai2) {
            ans.add(ai)
        } else if (ai > ai2) {
            ans.add(ai)
            for (j in ai - 1 downTo ai2 + 1) {
                ans.add(j)
            }
        } else {
            ans.add(ai)
            for (j in ai + 1 until ai2) {
                ans.add(j)
            }
        }
    }
    return ans.joinToString(" ")
}