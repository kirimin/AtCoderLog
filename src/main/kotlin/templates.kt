import utilities.debugLog
import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem000a(a))
}

fun problem000a(a: List<Long>): Long {
    fun log(vararg values: Any) {
        debugLog(values)
    }
    return 0L
}