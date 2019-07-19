package abc

import java.math.BigDecimal
import java.util.*

val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val aList = mutableListOf<Long>()
    for (i in 0 until n) {
        aList.add(sc.nextLong())
    }
    var bList = mutableListOf<Long>()
    for (i in 1..n / 2) {
        bList.add(n - i * 2 + 1)
    }
    val reversed = bList.reversed().toMutableList()
    if (n % 2 != 0L) {
        reversed.add(0, 0)
    }
    bList = (bList + reversed).toMutableList()
    if (aList.sorted() != bList.sorted()) {
        println(0)
        return
    }
    val ans = BigDecimal.valueOf(2)
        .pow( (n / 2).toInt())
        .remainder(BigDecimal(mod))
    println(ans.toLong())
}
