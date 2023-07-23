package abc

import java.util.*

fun main(args: Array<String>) {
    Thread(null, Main289D(), "whatever", 1 shl 28).start()
}

class Main289D : Runnable {
    override fun run() {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val a = (0 until n).map { sc.next().toInt() }
        val m = sc.nextInt()
        val b = (0 until m).map { sc.next().toInt() }
        val x = sc.nextInt()
        println(problem289d(n, a, m, b, x))
    }
}

fun problem289d(n: Int, a: List<Int>, m: Int, b: List<Int>, x: Int): String {
    var ans = false
    val b = b.toSet()
    val set = mutableSetOf<Int>()
    fun function (i: Int) {
        if (set.contains(i)) return
        set.add(i)
        if (i > x) return
        if (i == x) {
            ans = true
            return
        }
        if (b.contains(i)) {
            return
        }
        for (j in 0 until n) {
            function(i + a[j])
        }
    }
    function(0)
    return if (ans) "Yes" else "No"
}