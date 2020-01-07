package atc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { sc.next().toList() }
    println(problem001a(h, w, a))
}

fun problem001a(h: Int, w: Int, a: List<List<Char>>): String {
    val seen = Array(h) { Array(w) { '_' } }
    val todo = Stack<Pair<Int, Int>>()
    var s = 0 to 0
    var g = 0 to 0
    for (i in 0 until a.size) {
        for (j in 0 until a[i].size) {
            val c = a[i][j]
            if (c == 's') s = i to j
            if (c == 'g') g = i to j
        }
    }
    seen[s.first][s.second] = 's'
    todo.push(s)
    while (todo.isNotEmpty()) {
        val v = todo.pop()
        // left
        if (v.second - 1 >= 0 && a[v.first][v.second - 1] != '#' && seen[v.first][v.second - 1] == '_') {
            seen[v.first][v.second - 1] = a[v.first][v.second - 1]
            todo.push(v.first to v.second - 1)
        }
        // right
        if (v.second + 1 < w && a[v.first][v.second + 1] != '#' && seen[v.first][v.second + 1] == '_') {
            seen[v.first][v.second + 1] = a[v.first][v.second + 1]
            todo.push(v.first to v.second + 1)
        }
        // top
        if (v.first - 1 >= 0 && a[v.first - 1][v.second] != '#' && seen[v.first - 1][v.second] == '_') {
            seen[v.first - 1][v.second] = a[v.first - 1][v.second]
            todo.push(v.first - 1 to v.second)
        }
        // bottom
        if (v.first + 1 < h && a[v.first + 1][v.second] != '#' && seen[v.first + 1][v.second] == '_') {
            seen[v.first + 1][v.second] = a[v.first + 1][v.second]
            todo.push(v.first + 1 to v.second)
        }
    }
    return if (seen[g.first][g.second] == 'g') "Yes" else "No"
}