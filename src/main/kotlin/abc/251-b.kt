package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem251b(n, w, a))
}

fun problem251b(n: Int, w: Int, a: List<Int>): Int {
    val set = mutableSetOf<Int>()
    for (i in 0 until n) {
        set.add(a[i])
        for (j in i + 1 until n) {
            set.add(a[i] + a[j])
            for (k in j + 1 until n) {
                set.add(a[i] + a[j] + a[k])
            }
        }
    }
    return set.filter { it <= w }.size
}