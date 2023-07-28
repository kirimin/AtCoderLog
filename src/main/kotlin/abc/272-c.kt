package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem272c(n, a))
}

fun problem272c(n: Int, a: List<Long>): Long {
    val a = a.sortedDescending()
    val gusus = mutableListOf<Long>()
    for (i in 0 until n) {
        if (a[i] % 2 == 0L) gusus.add(a[i])
        if (gusus.size == 2) break
    }

    val kisus = mutableListOf<Long>()
    for (i in 0 until n) {
        if (a[i] % 2 != 0L) kisus.add(a[i])
        if (kisus.size == 2) break
    }
    var gusu = 0L
    if (gusus.size < 2) {
        gusu = -1
    } else {
        gusu = gusus.sum()
    }
    var kisu = 0L
    if (kisus.size < 2) {
        kisu = -1
    } else {
        kisu = kisus.sum()
    }
    return if (gusu > kisu) gusu else kisu

}
