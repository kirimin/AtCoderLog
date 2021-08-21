package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val k = sc.nextInt()
    val uv = (0 until m).map { sc.next().toInt() to sc.next().toInt() }
    println(problem212e(n, m, k, uv))
}

fun problem212e(n: Int, m: Int, k: Int, uv: List<Pair<Int, Int>>): Int {

    return 0
}