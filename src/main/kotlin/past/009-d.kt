package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until n).map { sc.next().toLong() }
    println(problem009d(n, a, b))
}

fun problem009d(n: Int, a: List<Long>, b: List<Long>): String {
    val ans = mutableListOf<Pair<Int, Pair<Long, Long>>>()
    for (i in 0 until n) {
        ans.add(i to (a[i] to b[i]))
    }
    return ans.sortedWith(kotlin.Comparator { x, y ->
        return@Comparator if (x.second.first + x.second.second !=
            y.second.first + y.second.second) {
            (y.second.first  + y.second.second).compareTo(x.second.first + x.second.second)
        } else if(x.second.first != y.second.first) {
            y.second.first.compareTo(x.second.first)
        } else {
            x.first.compareTo(y.first)
        }
    }).map { it.first + 1 }.joinToString(" ")
}
