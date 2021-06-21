package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem006e(n, s))
}

fun problem006e(n: Int, s: String): String {
    val ans = mutableListOf<String>()
    val a = LinkedList<Int>()
    for (i in 0 until n) {
        val si = s[i]
        var i = i + 1
        when (si) {
            'L' -> a.add(0, i)
            'R' -> a.add(i)
            'A' -> {
                if (a.size <= 0) {
                    ans.add("ERROR")
                } else {
                    ans.add(a[0].toString())
                    a.removeAt(0)
                }
            }
            'B' -> {
                if (a.size <= 1) {
                    ans.add("ERROR")
                } else {
                    ans.add(a[1].toString())
                    a.removeAt(1)
                }
            }
            'C' -> {
                if (a.size <= 2) {
                    ans.add("ERROR")
                } else {
                    ans.add(a[2].toString())
                    a.removeAt(2)
                }
            }
            'D' -> {
                if (a.size <= 0) {
                    ans.add("ERROR")
                } else {
                    ans.add(a[a.size - 1].toString())
                    a.removeAt(a.size - 1)
                }
            }
            'E' -> {
                if (a.size <= 1) {
                    ans.add("ERROR")
                } else {
                    ans.add(a[a.size - 2].toString())
                    a.removeAt(a.size - 2)
                }
            }
            'F' -> {
                if (a.size <= 2) {
                    ans.add("ERROR")
                } else {
                    ans.add(a[a.size - 3].toString())
                    a.removeAt(a.size - 3)
                }
            }
        }
    }
    return ans.joinToString("\n")
}