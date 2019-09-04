package other_contests

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val b1 = sc.nextInt()
    val b2 = sc.nextInt()
    val b3 = sc.nextInt()
    val l = mutableListOf<MutableList<Chokudaicon4Point>>()
    (0 until n).forEach { i ->
        l.add(mutableListOf())
        (0 until n).forEach { j ->
            l[i].add(
                Chokudaicon4Point(sc.next().toInt(), i, j)
            )
        }
    }
    val r = mutableListOf<MutableList<Chokudaicon4Point>>()
    (0 until n).forEach { i ->
        r.add(mutableListOf())
        (0 until n).forEach { j ->
            r[i].add(
                Chokudaicon4Point(sc.next().toInt(), i, j)
            )
        }
    }
    println(problemChokudaicon4(n, b1, b2, b3, l, r))
}

fun problemChokudaicon4(
    n: Int,
    b1: Int,
    b2: Int,
    b3: Int,
    l: MutableList<MutableList<Chokudaicon4Point>>,
    r: MutableList<MutableList<Chokudaicon4Point>>
): String {
    val b = listOf(b1, b2, b3)
    val ansList = mutableListOf<MutableList<Chokudaicon4Point>>()
    for (i in 0 until n) {
        ansList.add(mutableListOf())
        for (j in 0 until n) {
            var isContinue = false
            val range = l[i][j].num..r[i][j].num
            b.forEach {
                if (it in range) {
                    ansList[i].add(Chokudaicon4Point(it))
                    isContinue = true
                    return@forEach
                }
            }
            if (isContinue) continue
            ansList[i].add(Chokudaicon4Point(l[i][j].num))
        }
    }

    var ans = ""
    ansList.forEach {
        ans += it.joinToString(" ") + "\n"
    }
    return ans
}

fun search(int: Int, bottom: Int, top: Int): Boolean {
    return int in bottom..top
}

class Chokudaicon4Point(val num: Int, val i: Int = 0, val j: Int = 0) {
    override fun toString(): String {
        return num.toString()
    }
}