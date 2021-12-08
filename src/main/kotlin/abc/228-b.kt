package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem228b(n, x, a))
}

fun problem228b(n: Int, x: Int, a: List<Int>): Int {
    var set = hashSetOf<Int>()
    var current = x - 1
    while (!set.contains(current)) {
        set.add(current)
        current = a[current] - 1
    }
    return set.size
}