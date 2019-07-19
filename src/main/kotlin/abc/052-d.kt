package abc

import java.util.*

fun main(args : Array<String>) {

    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val walk = sc.nextLong()
    val teleport = sc.nextLong()
    val xList = mutableListOf<Long>()
    for (i in 1..n) {
        xList.add(sc.nextLong())
    }

    var currentPosition = if (xList.size != 0) xList[0] else 0
    var totalDamage = 0L
    xList.forEach { nextTown ->
        val distance = nextTown - currentPosition
        val walkDamage = distance * walk
        totalDamage += Math.min(walkDamage, teleport)
        currentPosition = nextTown
    }

    println(totalDamage)
}