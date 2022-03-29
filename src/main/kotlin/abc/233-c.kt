package abc

import utilities.debugLog
import java.lang.Exception
import java.util.*

fun main()
{
    Thread(null, Main233c(), "whatever", 1 shl 28).start()
}
class Main233c : Runnable
{
    override fun run()
    {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val x = sc.nextLong()
        val l = (0 until n).map {
            val l = sc.next().toInt()
            (0 until l).map { sc.next().toLong() }
        }
        println(problem233c(n, x, l))
    }
}

fun problem233c(n: Int, x: Long, l: List<List<Long>>): Int {
    var count = 0
    fun search(i: Int, multi: Long) {
        if (i == n) {
            if (multi == x) count++
            return
        }
        for (j in 0 until l[i].size) {
            val tmp = l[i][j]
            if (x % tmp != 0L) continue
            try {
                search(i + 1, Math.multiplyExact(multi, l[i][j]))
            } catch (e: Exception) {
                continue
            }
        }
    }
    search(0, 1)
    return count
}