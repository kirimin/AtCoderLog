package other_contests.hitachi

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val m = sc.nextInt()
    val aHash = hashMapOf<Int, Int>()
        (1..a).forEach {
            aHash[it] = sc.next().toInt()
        }
    val bHash = hashMapOf<Int, Int>()
    (1..b).forEach {
        bHash[it] = sc.next().toInt()
    }
    val xyc = (0 until m).map { Triple(sc.nextInt(), sc.nextInt(), sc.nextInt()) }
    println(problemHitachib(a, b, m, aHash, bHash, xyc))
}

fun problemHitachib(
    a: Int,
    b: Int,
    m: Int,
    aHash: HashMap<Int, Int>,
    bHash: HashMap<Int, Int>,
    xyc: List<Triple<Int, Int, Int>>
): Int {
    var min = Integer.MAX_VALUE
    for (i in 0 until m) {
        val (x, y, c)  = xyc[i]
        val value = aHash[x]!! + bHash[y]!! - c
        min = Math.min(min, value)
    }
    min = Math.min(min, aHash.minBy { it.value }!!.value + bHash.minBy { it.value }!!.value)
    return min
}