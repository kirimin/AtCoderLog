package abc

import java.util.*

fun main(args: Array<String>) {
    Thread(null, Main311D(), "whatever", 1 shl 28).start()
}

class Main311D : Runnable {
    override fun run() {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val m = sc.nextInt()
        val s = (0 until n).map { sc.next() }
        println(problem311d(n, m, s))
    }
}

fun problem311d(n: Int, m: Int, s: List<String>): Int {
    val seen = Array(n) { Array(m) { "_" } }
    val seenList = mutableListOf<Array<Array<String>>>()
    val startList = mutableSetOf<Triple<Int, Int, String>>()
    fun function(firstN: Int, firstM: Int, direction: String) {
        if (startList.contains(Triple(firstN, firstM, direction))) return
        var isFirst = true
        val deque = ArrayDeque<Pair<Int, Int>>()
        seen[firstN][firstM] = "0"
        deque.offer(firstN to firstM)
        while (deque.isNotEmpty()) {
            val v = deque.poll()
            seen[v.first][v.second] = seen[v.first][v.second]
            fun searchPosition(yOffset: Int = 0, xOffset: Int = 0) {
                val y = v.first + yOffset
                val x = v.second + xOffset
                    if (s[y][x] == '#') {
                        if (isFirst) {
                            seenList.add(seen)
                            return
                        } else {
                            // 方向転換
                            startList.add(Triple( firstN, firstM, direction))
                            seenList.add(seen)
                            if (direction == "left") {
                                function(v.first, v.second, "top")
                                function(v.first, v.second, "bottom")
                                function(v.first, v.second, "right")
                            } else if (direction == "right") {
                                function(v.first, v.second, "bottom")
                                function(v.first, v.second, "top")
                                function(v.first, v.second, "left")
                            } else if (direction == "top") {
                                function(v.first, v.second, "right")
                                function(v.first, v.second, "left")
                                function(v.first, v.second, "bottom")
                            } else if (direction == "bottom") {
                                function(v.first, v.second, "left")
                                function(v.first, v.second, "right")
                                function(v.first, v.second, "top")
                            }
                        }
                    } else {
                        seen[y][x] = (seen[v.first][v.second].toInt() + 1).toString()
                        deque.offer(y to x)
                    }
            }
            // left
            if (v.second - 1 >= 0 && direction == "left") {
                searchPosition(xOffset = -1)
            }
            // right
            if (v.second + 1 < m && direction == "right") {
                searchPosition(xOffset = 1)
            }
            // top
            if (v.first - 1 >= 0 && direction == "top") {
                searchPosition(yOffset = -1)
            }
            // bottom
            if (v.first + 1 < n && direction == "bottom") {
                searchPosition(yOffset = 1)
            }
            isFirst = false
        }
    }
    function(1, 1, "bottom")
    function(1, 1, "right")
    function(1, 1, "top")
    function(1, 1, "left")
    return seen.map { it.count { it != "_" } }.sum()
}