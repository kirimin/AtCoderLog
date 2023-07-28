package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem296a(n, s))
}

fun problem296a(n: Int, s: String): String {
    var man = s[0] == 'M'
    for (i in 1 until n) {
        if (man && s[i] == 'F') {
            man = false
            continue
        }
        if (!man && s[i] == 'M') {
            man = true
            continue
        }
        return "No"
    }
    return "Yes"
}