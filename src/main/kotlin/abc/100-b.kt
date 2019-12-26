package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val d = sc.nextInt()
    val n = sc.nextInt()
    println(problem100b(d, n))
}

fun problem100b(d: Int, n: Int): Int {
    val list = mutableListOf<Int>()
    for (i in 1..Int.MAX_VALUE) {
        var count = 0
        var num = i
        while (num % 100 == 0) {
            num /= 100
            count++
        }
        if (count == d) list.add(i)
        if(list.size >= n) {
            break
        }
    }
    return list.last()
}