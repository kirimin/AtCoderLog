package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val pList = (0 until n).map { sc.nextInt() }
    println(problem135b(n, pList))
}

fun problem135b(a: Int, pList: List<Int>): String {
    val sorted = pList.sorted()
    var count = 0
    sorted.forEachIndexed { index, num ->
        if (sorted[index] != pList[index]) {
            count++
        }
    }
    return if (count == 0 || count == 2) {
        "YES"
    } else {
        "NO"
    }
}
