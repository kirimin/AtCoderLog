package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    val q = sc.nextInt()
    val tab = (0 until q).map { Triple(sc.next().toInt(), sc.next().toInt(), sc.next().toInt()) }
    println(problem199c(n, s, q, tab))
}

fun problem199c(n: Int, s: String, q: Int, tab: List<Triple<Int, Int, Int>>): String {
    val list = s.toMutableList()
    var isSwaped = false
    for (i in 0 until q) {
        var (t, a, b) = tab[i]
        when (t) {
            1 -> {
                if (isSwaped) {
                    if (a <= list.size / 2) {
                        a += (list.size) / 2
                    } else {
                        a -= (list.size) / 2
                    }
                    if (b > list.size / 2) {
                        b -= (list.size) / 2
                    } else {
                        b += (list.size) / 2
                    }
                }
                a--
                b--
                val tmp = list[a]
                list[a] = list[b]
                list[b] = tmp

            }
            2 -> {
                isSwaped = !isSwaped
            }
        }
    }
    if (isSwaped) {
        val right = list.take((list.size) / 2)
        val left = list.takeLast(list.size / 2)
        return (left + if (list.size % 2 != 0) listOf(list[list.size / 2 + 1]) else emptyList<Char>() + right).joinToString("")
    }
    return list.joinToString("")
}