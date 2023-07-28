package abc

import utilities.debugLog
import java.util.*

fun main()
{
    Thread(null, Main286C(), "whatever", 1 shl 28).start()
}

class Main286C : Runnable {
    override fun run() {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val a = sc.next().toLong()
        val b = sc.next().toLong()
        val s = sc.next()
        println(problem286c(n, a, b, s))
    }
}

fun problem286c(n: Int, a: Long, b: Long, s: String): Long {
    var ans = Long.MAX_VALUE / 2
    val used = mutableSetOf<String>()
    fun function (deque: ArrayDeque<Char>, sum: Long) {
        val s = deque.joinToString("")
        if (used.contains(s)) return
        used.add(s)
        val left = s.take(n / 2)
        val right = s.takeLast(n / 2).reversed()
//        debugLog(left, right, sum)
        if (left == right) {
            ans = Math.min(ans, sum)
            return
        }
        var sum2 = sum
        for (i in 0 until n / 2) {
            if (left[i] != right[i]) {
                sum2 += b
            }
        }
        ans = Math.min(ans, sum2)

        deque.add(deque.pollFirst())
        function(deque, sum + a)
    }
    function(ArrayDeque(s.toList()), 0)
    return ans
}