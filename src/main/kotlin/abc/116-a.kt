package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val ab = sc.nextInt()
    val bc = sc.nextInt()
    val cd = sc.nextInt()
    println(problem116a(ab, bc, cd))
}

fun problem116a(ab: Int, bc: Int, cd: Int): Int {
    return ab * bc / 2
}