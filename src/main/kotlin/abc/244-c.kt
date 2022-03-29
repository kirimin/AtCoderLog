package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    problem244c(n, sc)
}

fun problem244c(n: Int, sc: Scanner): String {
    val set = mutableSetOf<Int>()
    set.add(1)
    println(1)
    var input = sc.next().toInt()
    set.add(input)
    while (input != 0) {
        for (i in 1..2 * n + 1) {
            if (!set.contains(i)) {
                println(i)
                set.add(i)
                break
            }
        }
        input = sc.next().toInt()
        if (input != 0) {
            set.add(input)
        }
    }
    return ""
}