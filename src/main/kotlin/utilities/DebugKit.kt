package utilities

import kotlin.random.Random

fun debugLog(vararg values: Any) {
    println("debug： ${values.toList()}")
}

var countMap = mutableMapOf<String, Int>()
fun debugCount(name: String = "count") {
    var count = countMap[name]
    countMap[name] = count?.plus(1) ?: 1
    countMap[name]?.let {
        debugLog(name, it)
    }

}