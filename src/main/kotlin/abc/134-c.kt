package abc

import java.util.*
import java.io.PrintWriter

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val n = Integer.parseInt(sc.next())
    val aList = (1..n).map { Integer.parseInt(sc.next()) }.toIntArray()
    val sortedAList = aList.sorted()

    val out = PrintWriter(System.out)
    (1..n).forEach { i ->
        val ai = aList[i - 1]
        val max = sortedAList[sortedAList.size - 1]
        if (max == ai) {
            out.println(sortedAList[sortedAList.size - 2])
        } else {
            out.println(max)
        }
    }
    out.flush()
}