package abc

//import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val c = (0 until 10).map { (0 until 10).map { sc.next().toInt() } }
    val a = (0 until h).map { (0 until w).map { sc.next().toInt() } }
    println(problem079d(h, w, c, a))
}

fun problem079d(h: Int, w: Int, c: List<List<Int>>, a: List<List<Int>>): Long {
    val routes = Array(10) { mutableListOf<Pair<Int, Int>>() }
    for (i in 0 until 10) {
        for (j in 0 until 10) {
            if (i == j) continue
            routes[i].add(j to c[i][j])
        }
    }

    val q = PriorityQueue<Pair<Int, Int>> { x: Pair<Int, Int>, y: Pair<Int, Int> ->
        x.second.compareTo(y.second)
    }
    val costsList = Array(10) { LongArray(10) { 0 } }
    for (city in 0 until 10) {
        q.clear()
        val costs = LongArray(10) { Long.MAX_VALUE }
        val doneList = BooleanArray(10) { false }
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
        costsList[city] = costs
    }

    var sum = 0L
    val aFlatten = a.flatMap { it }.filter { it != -1 && it != 1 }.sorted().groupBy { it }
    for (i in 0..9) {
        val size = aFlatten[i] ?: continue
        sum += costsList[i][1] * size.size
    }
    return sum
}