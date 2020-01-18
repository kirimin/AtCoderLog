package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val n = sc.nextInt()
    println(problem032a(a, b, n))
}

fun problem032a(a: Int, b: Int, n: Int): Int {
    for (i in n..Int.MAX_VALUE) {
        if (i % b == 0 && i % a == 0) return i
    }
    return 0
}