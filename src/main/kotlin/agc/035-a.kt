package agc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem035a(n, a))
}

fun problem035a(n: Int, a: List<Long>): String {
    val set = a.toSet()
    if (set.size == 1) {
        if (a.all { it == 0L }) {
            return "Yes"
        }
    } else if (set.size == 2) {
        val min = set.sorted()[0]
        if (min == 0L) {
            if (a.count { it ==min } * 3 == n ) {
                return "Yes"
            }
        }
    } else if (set.size == 3) {
        val list = set.toList()
        if (a.count { it == list[0]} == a.count { it == list[1] } && a.count { it == list[1] } == a.count { it == list[2] }) {
            if (list[0] xor list[1] == list[2]) {
                return "Yes"
            }
        }
    }

    return "No"
}