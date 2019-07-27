package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = Integer.parseInt(sc.next())
    val pList = (0 until n).map { sc.nextInt() }
    var count = 0
    pList.forEachIndexed { i, pi ->
        if(i == 0 || i == pList.size -1) return@forEachIndexed
        if(listOf(pList[i - 1], pi, pList[i + 1]).sorted()[1] == pi) count++
    }
    println(count)
}