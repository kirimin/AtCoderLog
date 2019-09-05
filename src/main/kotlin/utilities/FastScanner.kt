package utilities

import java.io.IOException
import java.util.NoSuchElementException

/***
 * from https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
 */
class FastScanner {
    private val `in` = System.`in`
    private val buffer = ByteArray(1024)
    private var ptr = 0
    private var buflen = 0
    private fun hasNextByte(): Boolean {
        if (ptr < buflen) {
            return true
        } else {
            ptr = 0
            try {
                buflen = `in`.read(buffer)
            } catch (e: IOException) {
                e.printStackTrace()
            }

            if (buflen <= 0) {
                return false
            }
        }
        return true
    }

    private fun readByte(): Int {
        return if (hasNextByte()) buffer[ptr++].toInt() else -1
    }

    private fun isPrintableChar(c: Int): Boolean {
        return c in 33..126
    }

    operator fun hasNext(): Boolean {
        while (hasNextByte() && !isPrintableChar(buffer[ptr].toInt())) ptr++
        return hasNextByte()
    }

    operator fun next(): String {
        if (!hasNext()) throw NoSuchElementException()
        val sb = StringBuilder()
        var b = readByte()
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b)
            b = readByte()
        }
        return sb.toString()
    }

    fun nextLong(): Long {
        if (!hasNext()) throw NoSuchElementException()
        var n: Long = 0
        var minus = false
        var b = readByte()
        if (b == '-'.toInt()) {
            minus = true
            b = readByte()
        }
        if (b < '0'.toInt() || '9'.toInt() < b) {
            throw NumberFormatException()
        }
        while (true) {
            if ('0'.toInt() <= b && b <= '9'.toInt()) {
                n *= 10
                n += (b - '0'.toInt()).toLong()
            } else return if (b == -1 || !isPrintableChar(b)) {
                if (minus) -n else n
            } else {
                throw NumberFormatException()
            }
            b = readByte()
        }
    }

    fun nextInt(): Int {
        val nl = nextLong()
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw NumberFormatException()
        return nl.toInt()
    }

    fun nextDouble(): Double {
        return java.lang.Double.parseDouble(next())
    }
}