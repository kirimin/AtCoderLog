package utilities

import java.math.BigDecimal
import java.math.MathContext
import java.util.*


object MathSample {

    /***
     * 10^9 + 7
     */
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()

    /**
     * Doubleを使わないpow
     */
    fun longPow(a: Long, b: Long, needMod: Boolean = false): Long {
        /***
         * 10^9 + 7
         */
        val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
        var ans = 1L
        for (i in 0 until b) {
            ans *= a
            if (needMod) ans %= mod
        }
        return ans
    }

    /**
     * 最大公約数
     */
    fun computeGreatestCommonDivisor(a: Long, b: Long): Long {
        val big: Long
        val small: Long
        if (a > b) {
            big = a
            small = b
        } else {
            small = a
            big = b
        }
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }

    fun computeGreatestCommonDivisor(list: List<Long>): Long {
        var result = list[0]
        for (i in 1 until list.size) {
            result = computeGreatestCommonDivisor(result, list[i])
        }
        return result
    }

    /**
     * 最小公倍数
     * @param big 2つの値の大きな方
     * @param small 2つの値の小さな方
     */
    fun computeLeastCommonMultiple(a: Long, b: Long): Long {
        val big: Long
        val small: Long
        if (a > b) {
            big = a
            small = b
        } else {
            small = a
            big = b
        }
        return small * big / computeGreatestCommonDivisor(big, small)
    }

    fun computeLeastCommonMultiple(list: List<Long>): Long {
        var result = list[0]
        for (i in 1 until list.size) {
            result = computeLeastCommonMultiple(result, list[i])
        }
        return result
    }

    /**
     * 素因数分解
     */
    fun computePrimeFactorList(n: Long): List<Pair<Long, Long>> {
        val p = mutableListOf<Pair<Long, Long>>()
        var primeFactor = n
        for (i in 2..(Math.sqrt(n.toDouble()) + 1).toLong()) {
            if (primeFactor % i != 0L) continue
            var count = 0L
            while (primeFactor % i == 0L) {
                primeFactor /= i
                count++
            }
            p.add(i to count)
        }
        if (primeFactor != 1L) p.add(primeFactor to 1L)
        return p
    }

    /**
     * 約数の総和を求める
     * 素因数分解を行い、各素因数の合計を求め(0乗=1も含める)、それらを掛け合わせる
     */
    fun computeDivisorSum(n: Long): Long {
        val p = computePrimeFactorList(n)
        var ans = 1L
        for (i in p.indices) {
            val pi = p[i]
            for (j in 0..pi.second) {
                ans += Math.pow(pi.first.toDouble(), j.toDouble()).toLong()
            }
        }
        return ans
    }

    /**
     * 階乗を計算する
     */
    fun computeFactorial(n: Long): Long {
        return (1..n).toList().reduce { acc, l -> acc * l }
    }

    /**
     * 文字列から連続した文字の個数のリストに変換する
     */
    fun collectSameChar(string: String): List<Pair<Char, Int>> {
        val list = mutableListOf<Pair<Char, Int>>()
        var prev = ' '
        string.forEach {
            if (prev != it) {
                list.add(it to 1)
            } else {
                list[list.size - 1] = it to list.last().second + 1
            }
            prev = it
        }
        return list
    }

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

    /**
     * 1からNまでの整数に含まれる約数の数の合計を求める
     */
    fun divisorsCounts(n: Long): Long {
        var ans = 0L
        for (i in 1..n) {
            for (j in i..n step i) {
                ans++
            }
        }
        return ans
    }

    /**
     * 素数判定
     */
    fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        if (num == 2) return true
        if (num % 2 == 0) return false

        val sqrtNum = Math.sqrt(num.toDouble()).toInt()
        for (i in 3..sqrtNum step 2) {
            if (num % i == 0) return false
        }
        return true
    }

    /**
     * エラトステネスのふるい。1からnまでの素数を列挙する
     */
    fun sieveOfEratosthenes(n: Int): List<Int> {
        val primes = (2..n).toMutableList()
        for (i in 2..n) {
            if (isPrime(i)) {
                for (j in i * 2..n step i) {
                    primes.remove(j)
                }
            }
        }
        return primes
    }

    /**
     * 何回割り切れるか
     */
    fun log(num: Long, base: Long): Long {
        var count = 0L
        var tmp = num
        while (tmp % base == 0L) {
            tmp /= base
            count++
        }
        return count
    }

    /**
     * 組み合わせ
     */
    fun nCr(n: Int, r: Int): Int {
        if (r == 0 || r == n)
            return (1);
        else if (r == 1)
            return (n);
        return (nCr(n - 1, r - 1) + nCr(n - 1, r));
    }

    /**
     * N個の中から2個を選ぶ公式
     */
    fun take2ByN(n: Int): Int {
        return n * (n - 1) / 2
    }

    /**
     * 辞書順で順列の次の組み合わせにarrayを書き換える
     */
    fun nextPermutation(array: IntArray): Boolean {
        var i = array.size - 1
        while (i > 0 && array[i - 1] >= array[i]) i--
        if (i <= 0) return false
        var j = array.size - 1
        while (array[j] <= array[i - 1]) j--
        var temp = array[i - 1]
        array[i - 1] = array[j]
        array[j] = temp
        j = array.size - 1
        while (i < j) {
            temp = array[i]
            array[i] = array[j]
            array[j] = temp
            i++
            j--
        }
        return true
    }

    /**
     * 整数を「どのアイテムを選ぶのか」を表すListに変換
     * @param bit 集合を表す整数
     * @param n 何個のものについて考えているか
     * @return n個の中から選んだものの番号のみが含まれるList
     */
    fun integerToList(bit: Int, n: Int): List<Int> {
        val s = mutableListOf<Int>()
        for (i in 0 until n) {
            if (bit and (1 shl i) != 0) {
                s.add(i)
            }
        }
        return s
    }

    /**
     * 二分探索を使いkeyに一番近いkey未満のindex + 1を返す
     */
    fun lowerBound(list: List<Long>, key: Long): Int {
        var ng = -1
        var ok = list.size

        while (ok - ng > 1) {
            val mid = (ok + ng) / 2
            if (list[mid] >= key) ok = mid else ng = mid
        }
        return ok
    }

    /**
     * 指定した値以上の要素が初めて出現する場所を取得
     */
    internal class LowerBoundComparator<T : Comparable<T>?> : Comparator<T> {
        override fun compare(x: T, y: T): Int {
            return if (x!!.compareTo(y) >= 0) 1 else -1
        }
    }

    /**
     * 指定した値より大きい要素が初めて出現する場所を取得
     */
    internal class UpperBoundComparator<T : Comparable<T>?> : Comparator<T> {
        override fun compare(x: T, y: T): Int {
            return if (x!!.compareTo(y) > 0) 1 else -1
        }
    }

    fun dpsSample(h: Int, w: Int, a: List<CharArray>): Int {
        val seen = Array(h) { Array(w) { "_" } }
        val deque = ArrayDeque<Pair<Int, Int>>()
        seen[0][0] = "0"
        deque.offer(0 to 0)
        while (deque.isNotEmpty()) {
            val v = deque.poll()
            fun searchPosition(yOffset: Int = 0, xOffset: Int = 0) {
                val y = v.first + yOffset
                val x = v.second + xOffset
                if (v.second - 1 >= 0 && a[y][x] != '#' && seen[y][x] == "_") {
                    seen[y][x] = (seen[v.first][v.second].toInt() + 1).toString()
                    deque.offer(y to x)
                }
            }
            // left
            if (v.second - 1 >= 0) {
                searchPosition(xOffset = -1)
            }
            // right
            if (v.second + 1 < w) {
                searchPosition(xOffset = 1)
            }
            // top
            if (v.first - 1 >= 0) {
                searchPosition(yOffset = -1)
            }
            // bottom
            if (v.first + 1 < h) {
                searchPosition(xOffset = 1)
            }
        }
        if (seen[h - 1][w - 1] == "_") return -1
        var whiteCount = -1
        for (i in 0 until a.size) {
            for (j in 0 until a[i].size) {
                if (a[i][j] != '#') whiteCount++
            }
        }
        val minCost = seen[h - 1][w - 1]
        return whiteCount - minCost.toInt()
    }

    /**
     * 少数誤差回避sqrt
     */
    fun sqrt(a: BigDecimal, scale: Int): BigDecimal {
        var x = BigDecimal(Math.sqrt(a.toDouble()), MathContext.DECIMAL64)
        if (scale < 17) {
            x = x.setScale(scale, BigDecimal.ROUND_HALF_EVEN)
            return x
        }
        val b2 = BigDecimal(2)
        var tempScale = 16
        while (tempScale < scale) {
            x = x.subtract(
                x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN
                )
            )
            tempScale *= 2
        }
        return x
    }
}