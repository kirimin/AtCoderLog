package other_contests.ddcc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val k = sc.nextInt()
    val s = (0 until h).map { sc.next() }
    println(problemddccc(h, w, k, s))
}

fun problemddccc(h: Int, w: Int, k: Int, s: List<String>): String {
    val array = Array(h) { IntArray(w) }
    val hasBerryCheck = Array(h) { false }
    var current = 0
    for (i in 0 until h) {
        var hasBerry = false
        current++
        for (j in 0 until w) {
            val sij = s[i][j]
            if (sij == '#') {
                if (hasBerry) {
                    current++
                }
                hasBerry = true
            }
            array[i][j] = current
            hasBerryCheck[i] = hasBerry
        }
        if (hasBerryCheck.all { !it } || !hasBerry) {
            current--
        }
    }
    if (h != 1) {
        for (i in 0 until h) {
            if (!hasBerryCheck[i]) {
                var count = 0
                while (i + count < h - 1 && !hasBerryCheck[i + count]) count++
                for (j in 0 until w) {
                    array[i][j] = array[i + count][j]
                }
            }
        }
        for (i in h - 1 downTo 0) {
            if (!hasBerryCheck[i]) {
                var count = 0
                while (i - count > 0 && !hasBerryCheck[i - count]) count++
                for (j in 0 until w) {
                    array[i][j] = array[i - count][j]
                }
            }
        }
    }
    return array.map { it.joinToString(" ") }.joinToString("\n")
}