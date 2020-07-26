package abc

import utilities.debugLog
import java.util.*
import kotlin.math.abs
import kotlin.math.min

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problem160d(n, x, y))
}

fun problem160d(n: Int, x: Int, y: Int): String {
    val distanceList = IntArray(n - 1) { 0 }

    for (i in 1 until n) {
        for (j in i + 1 until n + 1) {
            val distanceWithDontUseShortCut = j - i
            val distanceOfItoX = abs(i - x)
            val distanceOfYtoJ = abs(j - y)
            val shortCutCost = 1
            val distanceWithUseShortCut = distanceOfItoX + shortCutCost + distanceOfYtoJ
            val shortestDistance = min(distanceWithDontUseShortCut, distanceWithUseShortCut)
            distanceList[shortestDistance - 1]++
        }
    }
    return distanceList.joinToString("\n")
}