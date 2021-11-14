package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val l = (0 until n).map { val l = sc.next().toInt()
        (0 until l).map { sc.next().toInt() }
    }
    println(problem226b(n, l))
}

fun problem226b(n: Int, l: List<List<Int>>): Int {
    return l.toSet().size
}