package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val m = sc.nextInt()
    val abc = (0 until m).map { Triple(sc.next().toLong(), sc.next().toLong(), sc.next().toLong()) }
    println(problem009i(n, m, abc))
}

fun problem009i(n: Long, m: Int, abc: List<Triple<Long, Long, Long>>): Int {
    var time = 0L
    return 0
}