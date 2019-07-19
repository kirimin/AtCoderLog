package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val sx = sc.nextInt()
    val sy = sc.nextInt()
    val tx = sc.nextInt()
    val ty = sc.nextInt()

    val dy = Math.abs(ty - sy)
    val dx = Math.abs(tx - sx)
    val answer = (1..dy).toList().map { "U" } + (1..dx).map { "R" } + // route1
            (1..dy).toList().map { "D" } + (1..dx).map { "L" } + // route2
            listOf("L") + (1..dy + 1).toList().map { "U" } + (1..dx + 1).map { "R" } + listOf("D") + // route3
            listOf("R") + (1..dy + 1).toList().map { "D" } + (1..dx + 1).map { "L" } + listOf("U") // route4
    println(answer.joinToString(""))
}
