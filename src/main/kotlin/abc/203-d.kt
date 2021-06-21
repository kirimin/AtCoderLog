package abc

import utilities.debugCount
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { (0 until n).map {  sc.next().toLong() } }
    println(problem203d(n, k, a))
}

fun problem203d(n: Int, k: Int, a: List<List<Long>>): Long {
    val heightMap1 = Array(n) { Array(n) {mutableListOf<Long>() } }
    fun computeHeight(i: Int, j: Int): Long {
        val heights = mutableListOf<Long>()
        for (y in i until i + k) {
            if (heightMap1[y][j].isEmpty()) {
                for (x in j until j + k) {
                    heightMap1[y][j].add(a[y][x])
                    debugCount()
                }
            }
            heights.addAll(heightMap1[y][j])
        }
        return heights.sortedDescending()[k * k / 2]
    }

    var min = Long.MAX_VALUE
    for (i in 0..n - k) {
        for (j in 0..n - k) {
            val tmp = computeHeight(i, j)
            min = Math.min(min, tmp)
        }
    }
    return min
}