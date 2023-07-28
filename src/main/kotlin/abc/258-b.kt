package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toCharArray() }
    println(problem258b(n, a))
}

fun problem258b(n: Int, a: List<CharArray>): Long {
    var max = 0L
    for (i in 0 until n) {
        for (j in 0 until n) {
            var y = i
            var x = j
            var count = 1
            var top = a[y][x].toString()
            while (count < n) {
                y -= 1
                if (y == -1) y = n - 1
                top += a[y][x]
                count++
            }

            count = 1
            y = i
            x = j
            var bottom = a[y][x].toString()
            while (count < n) {
                y += 1
                if (y == n) y = 0
                bottom += a[y][x]
                count++
            }

            count = 1
            y = i
            x = j
            var left = a[y][x].toString()
            while (count < n) {
                x -= 1
                if (x == -1) x = n - 1
                left += a[y][x]
                count++
            }

            count = 1
            y = i
            x = j
            var right = a[y][x].toString()
            while (count < n) {
                x += 1
                if (x == n) x = 0
                right += a[y][x]
                count++
            }

            count = 1
            y = i
            x = j
            var topleft = a[y][x].toString()
            while (count < n) {
                y -= 1
                x -= 1
                if (y == -1) y = n - 1
                if (x == -1) x = n - 1
                topleft += a[y][x]
                count++
            }

            count = 1
            y = i
            x = j
            var topright = a[y][x].toString()
            while (count < n) {
                y -= 1
                x += 1
                if (y == -1) y = n - 1
                if (x == n) x = 0
                topright += a[y][x]
                count++
            }

            count = 1
            y = i
            x = j
            var bottomleft = a[y][x].toString()
            while (count < n) {
                y += 1
                x -= 1
                if (y == n) y = 0
                if (x == -1) x = n - 1
                bottomleft += a[y][x]
                count++
            }

            count = 1
            y = i
            x = j
            var bottomright = a[y][x].toString()
            while (count < n) {
                y += 1
                x += 1
                if (y == n) y = 0
                if (x == n) x = 0
                bottomright += a[y][x]
                count++
            }

            max = Math.max(max, listOf(top, bottom, left, right, topleft, topright, bottomleft, bottomright).max()!!.toLong())
        }
    }
    return max
}