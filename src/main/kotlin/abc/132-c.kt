package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = Integer.parseInt(sc.next())
    val dList = (0 until n).map { Integer.parseInt(sc.next()) }.sorted()
    val (median1,median2) = dList[n / 2 - 1] to dList[n / 2]
    if (dList.count { it < (median1 + median2) / 2F } == dList.count { it >= (median1 + median2) / 2F }) {
        println(median2 - median1)
    } else {
        println(0)
    }
}