package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem201(a, b, c))
}

fun problem201(a: Int, b: Int, c: Int): String {
    val list = listOf(a, b, c).sorted()
    val diffs = mutableListOf<Int>()
    for (i in 1 until list.size) {
       diffs.add(list[i] - list[i - 1])
    }
    return if (diffs.distinct().size == 1) "Yes" else "No"
}