package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem186c(n))
}

fun problem186c(n: Int): Int {
    var count = 0
    for (i in 1..n) {
        if (!i.toString().contains('7') && !Integer.toOctalString(i).contains('7')) count++
    }
    return count
}