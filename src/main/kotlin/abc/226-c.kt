package abc

import java.util.*

fun main() {
    Thread(null, C226(), "whatever", 1 shl 28).start()
}

class C226 : Runnable {
    override fun run() {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val tk = (0 until n).map {
            val t = sc.next().toLong()
            val k = sc.next().toInt()
            t to (0 until k).map { sc.next().toInt() }
        }
        println(problem226c(n, tk))
    }
}

fun problem226c(n: Int, tk: List<Pair<Long, List<Int>>>): Long {
    val needed = mutableSetOf<Int>()
    val goal = tk.last()
    fun func(i: Int) {
        if (needed.contains(i)) return
        needed.add(i)
        for (j in 0 until tk[i].second.size) {
            func(tk[i].second[j] - 1)
        }
    }
    for (i in 0 until goal.second.size) {
        func(goal.second[i] - 1)
    }
    var time = goal.first
    for (i in 0 until n) {
        if (needed.contains(i)) time += tk[i].first
    }
    return time
}