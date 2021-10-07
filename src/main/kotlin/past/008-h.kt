package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextLong()
    val abc = (0 until n - 1).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toInt()) }
    println(problem008h(n, x, abc))
}

fun problem008h(n: Int, x: Long, abc: List<Triple<Int, Int, Int>>): String {
    val routes = Array(n + 1) { mutableListOf<Pair<Int, Int>>() }
    for (i in 0 until n - 1) {
        val (a, b, c) = abc[i]
        routes[a - 1].add(b - 1 to c)
        routes[b - 1].add(a - 1 to c)
    }

    val ans = LongArray(n) { 0 }
    val q = PriorityQueue<Pair<Int, Int>> { x: Pair<Int, Int>, y: Pair<Int, Int> ->
        x.second.compareTo(y.second)
    }

    for (city in 0 until n) {
        q.clear()
        val costs = LongArray(n) { Long.MAX_VALUE }
        val doneList = BooleanArray(n) { false }
        for (j in 0 until routes[city].size) {
            val (route, cost) = routes[city][j]
            q.add(route to cost)
            costs[route] = Math.min(costs[route], cost.toLong())
        }
        while (q.isNotEmpty()) {
            val (route, _) = q.poll()
            if (doneList[route]) continue
            doneList[route] = true
            for (i in 0 until routes[route].size) {
                val (nextRoute, nextCost) = routes[route][i]
                val cost = costs[route] + nextCost
                if (cost < costs[nextRoute]) {
                    costs[nextRoute] = cost
                    q.add(nextRoute to cost.toInt())
                }
            }
        }
        for (i in 0 until costs.size) {
            if (i == city) continue
            if (costs[i] == x) return "Yes"
        }
        ans[city] = if (costs[city] == Long.MAX_VALUE) -1 else costs[city]
    }
    return "No"
}