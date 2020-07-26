package other_contests.company.aising

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val l = sc.nextInt()
    val r = sc.nextInt()
    val d = sc.nextInt()
    println(problem2020a(l, r, d))
}

fun problem2020a(l: Int, r: Int, d: Int): Int {
    var count = 0
    for (i in l..r) {
        if (i % d == 0) count++
    }
    return count
}