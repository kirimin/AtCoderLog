package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toLong()
    val l = sc.next().toLong()
    println(problem131b(n, l))
}

fun problem131b(n: Long, l: Long): Long {
    val apples = (1..n).map { l + it - 1 }

    val sum = Math.abs(apples.sum())
    var tmp = Long.MAX_VALUE
    apples.forEachIndexed { i, ai ->
        val sum2 = apples.filter { it != ai }.sum()
        if (Math.abs(sum - Math.abs(tmp)) > Math.abs(sum - Math.abs(sum2))) {
            tmp = sum2
        }
    }
    return tmp
}