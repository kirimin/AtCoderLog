package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem79b(n))
}

fun problem79b(n: Int): Long {
    val array = LongArray(n + 1) { 0 }
    array[0] = 2
    array[1] = 1
    for (i in 2..n) {
        array[i] = array[i - 2] + array[i - 1]
    }
    return array.last()
}