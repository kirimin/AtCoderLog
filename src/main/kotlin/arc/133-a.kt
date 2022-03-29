package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem133a(n, a))
}

fun problem133a(n: Int, a: List<Int>): String {
//    val counts = a.groupBy { it }.map { it.key to it.value }.sortedByDescending { it.second.size }
//    val list = mutableListOf<Int>()
//    val max = counts[0].second.size
//    for (i in 0 until counts.size) {
//        if (max != counts[i].second.size) {
//            break
//        }
//        list.add(counts[i].first)
//    }

    var prev = a[0]
    var ans = a[0]
    for (i in 1 until a.size) {
        if (prev > a[i]) {
            ans = prev
            break
        } else {
            prev = a[i]
        }
        if (i == a.size - 1) {
            ans = a[i]
        }
    }
    return a.filter { it != ans }.joinToString(" ")
}