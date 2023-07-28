package abc

import utilities.debugLog
import java.util.*
fun main()
{
    Thread(null, Main275(), "whatever", 1 shl 28).start()
}

class Main275 : Runnable {
    override fun run() {
        val sc = Scanner(System.`in`)
        val n = sc.nextLong()
        println(problem275d(n))
    }
}
fun problem275d(n: Long): Long {
    val map = mutableMapOf<Long, Long>()
    fun f(k : Long): Long {
        if (k == 0L) {
            map[k] = 1
            return 1
        }
        if (map[k] != null) {
            return map[k]!!
        }
        val temp = f(k / 2) + f(k / 3)
        map[k] = temp
        return temp
    }
    return f(n)
}