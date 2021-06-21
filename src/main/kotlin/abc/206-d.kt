package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem206d(n, a))
}

fun problem206d(n: Int, a: List<Int>): Int {
    var l = 0
    var r = n - 1
    var count = 0
    val changedSet = mutableSetOf<String>()
    val s = a.map { it.toString() }.toMutableList()
    while (true) {
        val al = s[l]
        val ar = s[r]
        if (al != ar && !(changedSet.contains(al) && changedSet.contains(ar))) {
            changedSet.add(al)
            changedSet.add(ar)
            count++
        }
        l++
        r--
        if ((n % 2 == 0 && r - l <= 0) || (n % 2 != 0 && r - l <= 1)) break
    }
    return count
}