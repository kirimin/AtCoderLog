package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val abc = sc.next()
    println(problem235a(abc))
}

fun problem235a(abc: String): Int {
    return (abc[0].toString() + abc[1].toString() + abc[2].toString()).toInt() +
            (abc[1].toString() + abc[2].toString() + abc[0].toString()).toInt() +
            (abc[2].toString() + abc[0].toString() + abc[1].toString()).toInt()
}
