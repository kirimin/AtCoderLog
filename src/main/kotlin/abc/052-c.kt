package abc

import java.util.*

val mod052: Long = (Math.pow(10.0, 9.0) + 7).toLong()

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val p = mutableListOf<Long>()
    for (i in 1..n) {
        p += computePrimeFactorList(i.toLong())
    }
    var count = 0
    p.sort()
    val pCount = mutableListOf<Int>()
    p.forEachIndexed { index, i ->
        count++
        if (index == p.size - 1 || i != p[index + 1]) {
            pCount.add(count)
            count = 0
        }
    }
    var ans = 1L
    pCount.map { it + 1L }.forEach {
        ans = ans * it % mod052
    }
    println(ans)
}

/**
 * 素因数分解
 * 対象の値が1になるまで素数で順番に割っていき割った数を列挙する
 */
fun computePrimeFactorList(n: Long): List<Long> {
    val p = mutableListOf<Long>()
    var primeFactor = n
    for (i in 2..n) {
        while (primeFactor % i == 0L) {
            primeFactor /= i
            p.add(i)
        }
    }
    return p
}