package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem155c(n, s))
}

fun problem155c(n: Int, s: List<String>): String {
    val map = mutableMapOf<String, Int>()
    for (i in s) {
        if (map.containsKey(i)) {
            map[i] = map[i]!! + 1
        } else {
            map[i] = 1
        }
    }
    val max = map.values.max()!!
    val maxList = map.filter { it.value == max }.keys
    return maxList.sorted().joinToString("\n")
}