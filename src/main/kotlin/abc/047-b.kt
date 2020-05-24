package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val w = sc.nextInt()
    val h = sc.nextInt()
    val n = sc.nextInt()
    val xya = (0 until n).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toInt()) }
    println(problem047b(w, h, n, xya))
}

fun problem047b(
    w: Int,
    h: Int,
    n: Int,
    xya: List<Triple<Int, Int, Int>>
): Int {
    val math = Array(w) { IntArray(h) { 0 } }
    for (i in 0 until n) {
        val (x, y, a) = xya[i]
        when (a) {
            1 -> {
                for (xi in 0 until x) {
                    for (yi in 0 until h) {
                        math[xi][yi] = 1
                    }
                }
            }
            2 -> {
                for (xi in x until w) {
                    for (yi in 0 until h) {
                        math[xi][yi] = 1
                    }
                }
            }
            3 -> {
                for (xi in 0 until w) {
                    for (yi in 0 until y) {
                        math[xi][yi] = 1
                    }
                }
            }
            4 -> {
                for (xi in 0 until w) {
                    for (yi in y until h) {
                        math[xi][yi] = 1
                    }
                }
            }
        }
    }
    return math.sumBy { it.count { it == 0 } }
}