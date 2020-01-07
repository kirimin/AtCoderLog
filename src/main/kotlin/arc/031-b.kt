package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = (0 until 10).map { sc.next().toList() }
    println(problem031b(a))
}

fun problem031b(a: List<List<Char>>): String {
    val h = 10
    val w = 10
    val seen = Array(h) { Array(w) { '_' } }
    val islands = mutableListOf<MutableList<Pair<Int, Int>>>()
    val todo = Stack<Pair<Int, Int>>()
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (seen[i][j] != '_' || a[i][j] != 'o') continue
            seen[i][j] = a[i][j]
            todo.push(i to j)
            islands.add(mutableListOf())
            islands.last().add(i to j)
            while (todo.isNotEmpty()) {
                val v = todo.pop()
                // left
                if (v.second - 1 >= 0 && seen[v.first][v.second - 1] == '_') {
                    seen[v.first][v.second - 1] = a[v.first][v.second - 1]
                    if (a[v.first][v.second - 1] == 'o') {
                        todo.push(v.first to v.second - 1)
                        islands.last().add(v.first to v.second - 1)
                    }
                }
                // right
                if (v.second + 1 < w && seen[v.first][v.second + 1] == '_') {
                    seen[v.first][v.second + 1] = a[v.first][v.second + 1]
                    if (a[v.first][v.second + 1] == 'o') {
                        todo.push(v.first to v.second + 1)
                        islands.last().add(v.first to v.second + 1)
                    }
                }
                // top
                if (v.first - 1 >= 0 && seen[v.first - 1][v.second] == '_') {
                    seen[v.first - 1][v.second] = a[v.first - 1][v.second]
                    if (a[v.first - 1][v.second] == 'o') {
                        todo.push(v.first - 1 to v.second)
                        islands.last().add(v.first - 1 to v.second)
                    }
                }
                // bottom
                if (v.first + 1 < h && seen[v.first + 1][v.second] == '_') {
                    seen[v.first + 1][v.second] = a[v.first + 1][v.second]
                    if (a[v.first + 1][v.second] == 'o') {
                        todo.push(v.first + 1 to v.second)
                        islands.last().add(v.first + 1 to v.second)
                    }
                }
            }
        }
    }
    for (i in 0 until h) {
        for (j in 0 until w) {
            if (islands.count { it.contains(i - 1 to j) || it.contains(i + 1 to j) || it.contains(i to j - 1) || it.contains(i to j + 1) } == islands.size) return "YES"
        }
    }
    return "NO"
}