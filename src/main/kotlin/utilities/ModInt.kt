package utilities

class ModInt(value: Long) {

    /***
     * 10^9 + 7
     */
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()

    val value = ((value % mod) + mod) % mod

    operator fun plus(other: ModInt): ModInt = ModInt(((value + other.value) % mod + mod) % mod)

    operator fun minus(other: ModInt): ModInt = ModInt(((value - other.value) % mod + mod) % mod)

    operator fun times(other: ModInt): ModInt = ModInt(((value * other.value) % mod + mod) % mod)

    operator fun div(other: ModInt): ModInt = ModInt(((value / other.value) % mod + mod) % mod)
}

fun Long.toModInt() = ModInt(this)