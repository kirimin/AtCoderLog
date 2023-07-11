package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem309a(a, b))
}

fun problem309a(a: Int, b: Int): String {
    when (a) {
        1 -> {
            return if (b == 2) "Yes" else "No"
        }
        2 -> {
            return if (b == 1 || b == 3) "Yes" else "No"
        }
        3 -> {
            return if (b == 2) "Yes" else "No"
        }
        4 -> {
            return if (b == 5) "Yes" else "No"
        }
        5 -> {
            return if (b == 4 || b == 6) "Yes" else "No"
        }
        6 -> {
            return if (b == 5) "Yes" else "No"
        }
        7 -> {
            return if (b == 8) "Yes" else "No"
        }
        8 -> {
            return if (b == 7 || b == 9) "Yes" else "No"
        }
        9 -> {
            return if (b == 8) "Yes" else "No"
        }
    }
    return ""
}