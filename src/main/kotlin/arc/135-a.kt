package arc

import utilities.debugLog
import java.math.BigInteger
import java.util.*

fun main() {
    Thread(null, Main(), "whatever", 1 shl 28).start()
}

class Main : Runnable {
    override fun run() {
        val sc = Scanner(System.`in`)
        val x = sc.nextBigInteger()
        println(problem135a(x))
    }
}

fun problem135a(x: BigInteger): BigInteger {
    val mod = BigInteger.valueOf(998244353)
    val two = BigInteger.valueOf(2)
    fun compute(x: BigInteger): Pair<BigInteger, BigInteger> {
        return (x / two) to ((x / two) + if (x % two != BigInteger.ZERO) BigInteger.ONE else BigInteger.ZERO)
    }
    val map = mutableMapOf<BigInteger, BigInteger>()
    fun search(x: BigInteger): BigInteger {
        val tmp = compute(x)
        if (map.containsKey(x)) {
            return map[x]!!
        }
        if (tmp.first * tmp.second > x) {
            val multi = search(tmp.first) * search(tmp.second)
            map[x] = multi % mod
            return multi % mod
        } else {
            return x % mod
        }
    }
    return search(x) % mod
}