package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val query = (0 until q).map {
        val t = sc.next().toInt()
        if (t == 1) {
            Triple(t, sc.next(), sc.next())
        } else {
            Triple(t, sc.next(), "")
        }
    }
    println(problem009j(n, q, query))
}

fun problem009j(n: Int, q: Int, query: List<Triple<Int, String, String>>): String {
    var isTopReverse = false
    var isSideReverse = false
    var rotate = 0
    var filed = Array(n) { IntArray(n) { 0 } }
    var isFirst = true
    fun rotate280() {
        val destArray = Array(n) { IntArray(n) { 0 } }
        for (i in 0 until n) {
            for (j in 0 until n) {
                destArray[i][j] = filed[j][n - i - 1]
            }
        }
        filed = destArray
    }

    fun rotate90() {
        val destArray = Array(n) { IntArray(n) { 0 } }
        for (i in 0 until n) {
            for (j in 0 until n) {
                destArray[i][j] = filed[n - j - 1][i]
            }
        }
        filed = destArray
    }

    fun reverseTop() {
        val destArray = Array(n) { IntArray(n) { 0 } }
        for (i in 0 until n) {
            for (j in 0 until n) {
                destArray[n - i - 1][j] = filed[i][j]
            }
        }
        filed = destArray
    }

    fun reverseSide() {
        val destArray = Array(n) { IntArray(n) { 0 } }
        for (i in 0 until n) {
            for (j in 0 until n) {
                destArray[i][n - j - 1] = filed[i][j]
            }
        }
        filed = destArray
    }
    for (i in 0 until q) {
        when (query[i].first) {
            1 -> {
                val (_, x, y) = query[i]
                var positionX = x.toInt() - 1
                var positionY = y.toInt() - 1
                debugLog(positionX, positionY)
                for (j in 0 until rotate / 90) {
                    positionY = n - positionX - 1
                }
                debugLog(positionX, positionY)
                debugLog("")
                if (filed[positionX][positionY] == 1) {
                    filed[positionX][positionY] = 0
                } else {
                    filed[positionX][positionY] = 1
                }
            }
            2 -> {
                val (_, c, _) = query[i]
                if (c == "A") {
                    rotate += 90
                } else {
                    rotate += 270
                }
            }
            3 -> {
                val (_, c, _) = query[i]
                if (c == "A") {
                    isTopReverse = !isTopReverse
                } else {
                    isSideReverse = !isSideReverse
                }
            }
        }
    }
    if (isTopReverse) {
        reverseTop()
    }
    if (isSideReverse) {
        reverseSide()
    }
    for (i in 0 until rotate / 90) {
        rotate90()
    }
    return filed.map { it.joinToString("") }.joinToString("\n")
}