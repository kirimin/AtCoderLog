package abc

//import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val q = sc.nextInt()
    val query = (0 until q).map {
        val n = sc.next().toInt()
        if (n == 1) {
            Triple(n, sc.next().toLong(), 0)
        } else if (n == 2) {
            Triple(n, sc.next().toLong(), sc.next().toInt())
        } else {
            Triple(n, 0L, 0)
        }
    }
    println(problem253c(q, query))
}

fun problem253c(q: Int, query: List<Triple<Int, Long, Int>>): String {
    val counts = mutableMapOf<Long, Int>()
    val treeSet = TreeSet<Long> { x: Long, y: Long ->
        x.compareTo(y)
    }
    val ans = mutableListOf<Long>()
    for (i in 0 until q) {
        val (n, x, c) = query[i]
        when (n) {
            1 -> {
                counts[x] = (counts[x] ?: 0) + 1
                treeSet.add(x)
            }
            2 -> {
                val count = counts[x] ?: 0
                val min = Math.min(count, c)
                if (count - min == 0) {
                    treeSet.remove(x)
                }
                counts[x] = count - min
            }
            3 -> {
//                debugLog(treeSet)
                ans.add(treeSet.last() - treeSet.first())
            }
        }
    }
    return ans.joinToString("\n")
}