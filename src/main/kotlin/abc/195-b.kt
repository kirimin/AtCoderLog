package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val w = sc.nextInt()
    println(problem195b(a, b, w))
}

fun problem195b(a: Int, b: Int, w: Int): String {
    var min = Integer.MAX_VALUE
    var max = 0
    for (i in 1..1000 * 1000) {
        // i = 個数
        if (w * 1000 in (a * i..b * i)) {
            min = Math.min(min, i)
            max = Math.max(max, i)
        }
    }
    if (max == 0) return "UNSATISFIABLE"
    return "$min $max"
}