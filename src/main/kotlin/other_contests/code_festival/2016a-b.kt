package other_contests.code_festival

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem2016b(n, a))
}

fun problem2016b(n: Int, a: List<Int>): Int {
    val map = mutableMapOf<Int, Int>()
    var count = 0
    for (i in 0 until n) {
        if (map.containsKey(a[i]) && map[a[i]] == i+1) count++
        map[i+1] = a[i]
    }
    return count
}