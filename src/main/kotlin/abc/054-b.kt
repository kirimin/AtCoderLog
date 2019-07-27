package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val m = sc.next().toInt()
    val aList = (0 until n).map { sc.next() }
    val bList = (0 until m).map { sc.next() }
    println(problem54b(aList, bList))
}

fun problem54b(aList:List<String>, bList:List<String>): String {
    val bListY = bList.size
    val bListX = bList[0].length
    aList.forEachIndexed { i, s ->
        if (i + bListY - 1 > aList.size - 1) return@forEachIndexed
        (0 until aList[0].length).forEach { j ->
            if (j + bListX > aList[0].length) return@forEach
            val subSquare = aList.drop(i).map { it.substring(j, j + bListX) }.take(bListY)
            if (subSquare == bList) return "Yes"
        }
    }
    return "No"
}

//a
//■□■
//□■□
//■□■

//b
//■□
//□■