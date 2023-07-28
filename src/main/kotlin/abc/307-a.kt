package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n * 7).map { sc.next().toInt() }
    println(problem307a(n, a))
}

fun problem307a(n: Int, a: List<Int>): String {
    val list = mutableListOf<Int>()
    var sum = 0
    for (i in 0 until n * 7) {
        sum += a[i]
        if (i % 7 == 6) {
            list.add(sum)
            sum = 0
        }
    }
    return list.joinToString(" ")
}