package abc

fun main(args: Array<String>) {
    val s1 = readLine()!!
    val s2 = readLine()!!
    val s3 = readLine()!!
    println(problem198d(s1, s2, s3))
}

fun problem198d(s1: String, s2: String, s3: String): String {
    /**
     * 辞書順で順列の次の組み合わせにarrayを書き換える
     */
    fun nextPermutation(array: IntArray): Boolean {
        for (i in array.size-2 downTo 0) {
            if (array[i] < array[i+1]) {
                for (j in array.size-1 downTo i+1) {
                    if (array[j] > array[i]) {
                        array[i] = array[j].also { array[j] = array[i] }

                        var l = i+1
                        var r = array.size-1
                        while (l < r) {
                            array[l] = array[r].also { array[r] = array[l] }
                            l++
                            r--
                        }
                        return true
                    }
                }
            }
        }
        return false
    }

    val set = (s1 + s2 + s3).toSet()
    if (set.size > 10) return "UNSOLVABLE"
    val dic = mutableMapOf<Char, Int>()
    for ((count, i) in set.withIndex()) {
        dic[i] = count
    }
    val ss1Idx = s1.map { dic[it]!! }
    val ss2Idx = s2.map { dic[it]!! }
    val ss3Idx = s3.map { dic[it]!! }

    val array = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    do {
        if (array[ss1Idx[0]] == 0 || array[ss2Idx[0]] == 0 || array[ss3Idx[0]] == 0) continue

        val ss1Num = ss1Idx.fold(0L) { acc, idx -> acc * 10L + array[idx] }
        val ss2Num = ss2Idx.fold(0L) { acc, idx -> acc * 10L + array[idx] }
        val ss3Num = ss3Idx.fold(0L) { acc, idx -> acc * 10L + array[idx] }

        if (ss1Num + ss2Num == ss3Num) {
            return "$ss1Num\n$ss2Num\n$ss3Num"
        }
    } while (nextPermutation(array))

    return "UNSOLVABLE"
}