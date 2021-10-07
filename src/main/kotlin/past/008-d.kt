package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problem008d(x, y))
}

fun problem008d(x: Int, y: Int): String {
    /**
     * nに含まれる約数列挙
     */
    fun enumDivisors(n: Long): List<Long> {
        val list = mutableListOf<Long>()
        for (i in 1..Math.sqrt(n.toDouble()).toLong()) {
            if (n % i == 0L) {
                list.add(i)
                if (n / i != i) list.add(n / i)
            }
        }
        return list.sorted()
    }
    val xD = enumDivisors(x.toLong()).size
    val yD = enumDivisors(y.toLong()).size
    return if (xD > yD) {
        "X"
    } else if (xD < yD) {
        "Y"
    } else {
        "Z"
    }
}