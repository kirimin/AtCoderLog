package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val k = sc.nextInt()
    println(problem120b(a, b, k))
}

fun problem120b(a: Int, b: Int, k: Int): Int {
    val list = mutableListOf<Int>()
    for (i in 1..100) {
        if (a % i == 0 && b % i == 0) list.add(i)
    }
    return list.sortedDescending()[k - 1]
}