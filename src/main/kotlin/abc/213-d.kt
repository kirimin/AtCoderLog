package abc

import utilities.debugLog
import java.util.*

import java.util.*
import java.io.*

fun main()
{
    Thread(null, Main(), "whatever", 1 shl 28).start()
}

class Main : Runnable
{
    override fun run()
    {
        val sc = Scanner(System.`in`)
        val n = sc.nextInt()
        val ab = (0 until n - 1).map { sc.next().toInt() to sc.next().toInt() }
        println(problem213d(n, ab))
    }
}

fun problem213d(n: Int, ab: List<Pair<Int, Int>>): String {
    val ans = mutableListOf<Int>()
    val routes = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until n - 1) {
        val (a, b) = ab[i]
        routes[a - 1].add(b - 1)
        routes[b - 1].add(a - 1)
    }

    val done = BooleanArray(n) { false }
    done[0] = true
    fun dfs(current: Int) {
        ans.add(current + 1)
        val sorted = routes[current].sorted()
        for (i in 0 until sorted.size) {
            val next = sorted[i]
            if (done[next]) {
                continue
            }
            done[next] = true
            dfs(next)
            ans.add(current + 1)
        }
    }
    dfs(0)
    return ans.joinToString("\n")
}