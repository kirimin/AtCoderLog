package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n - 1).map { sc.next().toInt() to sc.next().toInt() }
    val q = sc.nextInt()
    val tex = (0 until q).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toLong()) }
    println(problem187e(n, ab, q, tex))
}

fun problem187e(n: Int, ab: List<Pair<Int, Int>>, q: Int, tex: List<Triple<Int, Int, Long>>): String {
    val root = ab[0].first
    val tree = Array(n + 1) { mutableListOf<Int>() }
    for (i in 0 until n - 1) {
        val (a, b) = ab[i]
        tree[a].add(b)
        tree[b].add(a)
    }
    val queue = ArrayDeque<Int>()
    queue.offer(root)
    val distances = IntArray(n + 1) { -1 }
    distances[root] = 0
    while(!queue.isEmpty()) {
        val current = queue.poll()
        for (j in 0 until tree[current].size) {
            val next = tree[current][j]
            if (distances[next] != -1) continue

            distances[next] = distances[current] + 1
            queue.offer(next)
        }
    }

    val treeNums = Array(n + 1) { 0L }
    for (i in 0 until q) {
        val (ti, ei, xi) = tex[i]
        val (a, b) = ab[ei - 1]
        if (distances[a] > distances[b]) {
            if (ti == 2) {
                treeNums[root] += xi
                treeNums[a] -= xi
            } else {
                treeNums[a] += xi
            }
        } else {
            if (ti == 1) {
                treeNums[root] += xi
                treeNums[b] -= xi
            } else {
                treeNums[b] += xi
            }
        }
    }
    val ansTree = Array(n + 1) { 0L }

    val deque = ArrayDeque<Int>()
    deque.offer(root)
    ansTree[root] = treeNums[root]
    while (deque.isNotEmpty()) {
        val current = deque.poll()
        for (i in 0 until tree[current].size) {
            val next = tree[current][i]
            if (distances[next] > distances[current]) {
                ansTree[next] += ansTree[current] + treeNums[next]
                deque.offer(next)
            }
        }
    }
    return ansTree.drop(1).joinToString("\n")
}