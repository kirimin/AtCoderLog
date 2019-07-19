package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()

    val primeFactorList = mutableListOf<Int>()
    for (i in 1..n) {
        primeFactorList += computePrimeFactorList(i)
    }

    var count = 0
    val primeFactorCountList = mutableListOf<Int>()
    primeFactorList.sort()
    primeFactorList.forEachIndexed { index, i ->
        count++
        if (index == primeFactorList.size - 1 || i != primeFactorList[index + 1]) {
            primeFactorCountList.add(count)
            count = 0
        }
    }
    var divisorCount = 1L
    primeFactorCountList.map { it + 1L }.forEach {
        divisorCount = divisorCount * it % (1000000000 + 7)
    }
    println(divisorCount)
}

fun computePrimeFactorList(n: Int): List<Int> {
    val primeFactorList = mutableListOf<Int>()
    var primeFactor = n
    for (i in 2..n) {
        while (primeFactor % i == 0) {
            primeFactor /= i
            primeFactorList.add(i)
        }
    }
    return primeFactorList
}