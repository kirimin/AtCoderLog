package abc

import java.io.PrintWriter
import java.util.*

fun main(args: Array<String>) {
    val out = PrintWriter(System.out)
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val m = sc.nextLong()
    val py = mutableListOf<City113>()
    (0 until m).forEach { i ->
        py.add(City113(i, sc.next().toInt(), sc.next().toLong()))
    }
    out.println(problem113c(n, m, py))
    out.flush()
}

fun problem113c(n: Long, m: Long, py: MutableList<City113>): String {
    var current = 0
    var count = 0
    py.sorted().forEachIndexed { i, city ->
        if (current != city.p) {
            count = 0
            current = city.p
        }
        count++
        var ps = current.toString()
        while (ps.length < 6) {
            ps = "0$ps"
        }
        var cs = count.toString()
        while (cs.length < 6) {
            cs = "0$cs"
        }
        city.ans = ps + cs
    }
    return py.sortedBy { it.city }.joinToString("\n") { it.ans }
}

class City113(val city: Long, val p: Int, val y: Long, var ans: String = "") : Comparable<City113> {
    override fun compareTo(other: City113): Int {
        val diff = this.p - other.p
        if (diff != 0) return diff
        return (this.y - other.y).toInt()
    }
}