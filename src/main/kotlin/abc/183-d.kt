package abc

//import utilities.debugLog
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val w = sc.nextLong()
    val stp = (0 until n).map { Triple(sc.next().toLong(), sc.next().toLong(), sc.next().toLong()) }
    println(problem183d(n, w, stp))
}

fun problem183d(n: Int, w: Long, stp: List<Triple<Long, Long, Long>>): String {
    val TIME = 2000010
    val stp = stp.sortedBy { it.first }
    val needs = Array(TIME) { 0L }
    var lastIndex = 0
    for (time in 0 until TIME - 1) {
        if (time != 0) {
            needs[time] += needs[time - 1]
        }
        for (i in lastIndex until TIME - 1) {
            if (lastIndex == stp.size) break
            val tmp = stp[i]
            if (tmp.first != time.toLong()) break
            lastIndex++
            needs[time] += tmp.third
            needs[(tmp.second).toInt()] -= tmp.third
        }
        if (needs[time] > w) return "No"
    }
    return "Yes"
}