package typical90

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem002(n))
}

fun problem002(n: Int): String {
    if (n % 2 != 0) return ""
    /**
     * 辞書順で順列の次の組み合わせにarrayを書き換える
     */
    fun nextPermutation(array: CharArray): Boolean {
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

    val ans = mutableListOf<String>()
    val list = (CharArray(n / 2) { '(' } + CharArray(n / 2) { ')' }).sorted().toCharArray()
    ans.add(list.joinToString(""))
    var last = true
    while (last) {
        last = nextPermutation(list)
        var count1 = 0
        var count2 = 0
        var isWrong = false
        for (i in 0 until list.size) {
            if (list[i] == '(') count1++ else count2++
            if (count2 > count1) {
                isWrong = true
                break
            }
        }
        if (!isWrong) ans.add(list.joinToString(""))
    }
    return ans.joinToString("\n")
}