package utilities

import java.util.Comparator

object MathSample {

    /***
     * 10^9 + 7
     */
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()

    /**
     * 最大公約数
     * @param big 2つの値の大きな方
     * @param small 2つの値の小さな方
     */
    fun computeGreatestCommonDivisor(big: Long, small: Long): Long {
        val rest = big % small
        return if (rest == 0L) big else computeGreatestCommonDivisor(big, rest)
    }

    /**
     * 最小公倍数
     * @param big 2つの値の大きな方
     * @param small 2つの値の小さな方
     */
    fun computeLeastCommonMultiple(small: Long, big: Long): Long {
        return small * big / computeGreatestCommonDivisor(big, small)
    }


    /**
     * 素因数分解
     * 対象の値が1になるまで素数で順番に割っていき割った数を列挙する
     */
    fun computePrimeFactorList(n: Long): List<Long> {
        val p = mutableListOf<Long>()
        var primeFactor = n
        for (i in 2..n) {
            while (primeFactor % i == 0L) {
                primeFactor /= i
                p.add(i)
            }
        }
        return p
    }

    /**
     * 約数を数える
     */
    fun countDivisor(n: Long): Long {
        var count = 0L
        for (i in 1..n) {
            if (n % i == 0L) count++
        }
        return count
    }

    /**
     * 約数の総和を求める
     * 素因数分解を行い、各素因数の合計を求め(0乗=1も含める)、それらを掛け合わせる
     */
    fun computeDivisorSum(n: Long): Long {
        val p = computePrimeFactorList(n)
        var ans = 1L
        var nSum = 0
        var count = 0
        for (i in p.indices) {
            count++
            val pi = p[i]
            nSum += Math.pow(pi.toDouble(), count.toDouble()).toInt()
            if (i >= p.size - 1 || p[i + 1] != pi) {
                ans *= (nSum + 1)
                count = 0
                nSum = 0
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
     * binarySearchで同値を識別するために使用するComparator
     */
    class LowerBoundComparator<T : Comparable<T>> : Comparator<T> {
        override fun compare(x: T, y: T): Int {
            return if (x >= y) 1 else -1
        }
    }
}