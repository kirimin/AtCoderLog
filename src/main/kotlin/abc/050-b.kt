package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val tList = mutableListOf<Int>()
    for (i in 0 until n) {
        tList.add(sc.nextInt())
    }
    val m = sc.nextInt()
    val pxList = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until m) {
        pxList.add((sc.nextInt() to sc.nextInt()))
    }

    pxList.forEach { pair ->
        var sum = 0
        tList.forEachIndexed { i, it ->
            sum += if (i + 1 == pair.first) {
                pair.second
            } else {
                it
            }
        }
        println(sum)
    }
}