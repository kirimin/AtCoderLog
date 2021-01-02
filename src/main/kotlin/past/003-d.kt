package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until 5).map { sc.next() }
    println(problem3d(n, s))
}

fun problem3d(n: Int, s: List<String>): String {
    val numbers = arrayOf(
        arrayOf(
            '#', '#', '#',
            '#', '.', '#',
            '#', '.', '#',
            '#', '.', '#',
            '#', '#', '#'
        ).joinToString(""),
        arrayOf(
            '.', '#', '.',
            '#', '#', '.',
            '.', '#', '.',
            '.', '#', '.',
            '#', '#', '#'
        ).joinToString(""),
        arrayOf(
            '#', '#', '#',
            '.', '.', '#',
            '#', '#', '#',
            '#', '.', '.',
            '#', '#', '#'
        ).joinToString(""),
        arrayOf(
            '#', '#', '#',
            '.', '.', '#',
            '#', '#', '#',
            '.', '.', '#',
            '#', '#', '#'
        ).joinToString(""),
        arrayOf(
            '#', '.', '#',
            '#', '.', '#',
            '#', '#', '#',
            '.', '.', '#',
            '.', '.', '#'
        ).joinToString(""),
        arrayOf(
            '#', '#', '#',
            '#', '.', '.',
            '#', '#', '#',
            '.', '.', '#',
            '#', '#', '#'
        ).joinToString(""),
        arrayOf(
            '#', '#', '#',
            '#', '.', '.',
            '#', '#', '#',
            '#', '.', '#',
            '#', '#', '#'
        ).joinToString(""),
        arrayOf(
            '#', '#', '#',
            '.', '.', '#',
            '.', '.', '#',
            '.', '.', '#',
            '.', '.', '#'
        ).joinToString(""),
        arrayOf(
            '#', '#', '#',
            '#', '.', '#',
            '#', '#', '#',
            '#', '.', '#',
            '#', '#', '#'
        ).joinToString(""),
        arrayOf(
            '#', '#', '#',
            '#', '.', '#',
            '#', '#', '#',
            '.', '.', '#',
            '#', '#', '#'
        ).joinToString("")
    )

    var ans = ""
    for (i in 0 until n) {
        val s1 = s[0].drop(4 * i + 1).take(3)
        val s2 = s[1].drop(4 * i + 1).take(3)
        val s3 = s[2].drop(4 * i + 1).take(3)
        val s4 = s[3].drop(4 * i + 1).take(3)
        val s5 = s[4].drop(4 * i + 1).take(3)
        val display = arrayOf(s1, s2, s3, s4, s5).joinToString("")
        for (j in 0 until numbers.size) {
            if (numbers[j] == display) {
                ans += j
            }
        }
    }
    return ans
}

// j桁目 = 4j - 2, 4j - 1, 4j = 1桁目 > 4, 3, 2列目

// 1 2 3,
// 5 6 7,
// 9 10 11,
// 13 14 15