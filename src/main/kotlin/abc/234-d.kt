package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem234d(n, k, p))
}

fun problem234d(n: Int, k: Int, p: List<Int>): String {
    // 宣言
    val tree = TreeSet<Int> { x: Int, y: Int ->
        x.compareTo(y)
    }
    val list = mutableListOf<Int>()
    val ans = mutableListOf<Int>()
    var current = 0
    for (i in 0 until n) {
        val pi = p[i]
        list.add(pi)
        tree.add(pi)
        if (i > k - 1) {
            if (pi <= current) {
                ans.add(current)
            } else {
                current = tree.higher(current)
                ans.add(current)
            }
        } else if (i == k - 1) {
            current = list.min()!!
            ans.add(current)
        }
    }
    return ans.joinToString("\n")
}