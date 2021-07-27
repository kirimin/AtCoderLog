package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val abc = (0 until m).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toInt()) }
    println(problem191e(n, m, abc))
}

fun problem191e(n: Int, m: Int, abc: List<Triple<Int, Int, Int>>): String {
    class MyComparator : Comparator<Pair<Int, Int>> {
        override fun compare(arg0: Pair<Int, Int>, arg1: Pair<Int, Int>): Int {
            val x = arg0.second
            val y = arg1.second
            return if (x < y) {
                -1
            } else if (x > y) {
                1
            } else {
                0
            }
        }
    }

    val routes = Array(n + 1) { mutableListOf<Pair<Int, Int>>() }
    for (i in 0 until m) {
        val (a, b, c) = abc[i]
        routes[a - 1].add(b - 1 to c)
    }

    val ans = LongArray(n) { 0 }
    val q: PriorityQueue<Pair<Int, Int>> = PriorityQueue(n, MyComparator())

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
        ans[city] = if (costs[city] == Long.MAX_VALUE) -1 else costs[city]
    }
    return ans.joinToString("\n")
}