import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problemnotebook(n, a))
}

fun problemnotebook(n: Int, a: List<Long>): Long {
    fun take2ByN(n: Long): Long {
        return n * (n - 1L) / 2L
    }
    var count = 0L
    val group = a.groupBy { it % 200L }
    for (g in group) {
        count += take2ByN(g.value.size.toLong())
    }
    return count
}