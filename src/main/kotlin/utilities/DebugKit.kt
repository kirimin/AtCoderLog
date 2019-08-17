package utilities

fun debugLog(vararg values: Any) {
    println("debug： ${values.toList()}")
}

var debugCountMap = mutableMapOf<String, Int>()
fun debugCount(name: String = "count"): Int {
    debugCountMap[name] = debugCountMap[name]?.plus(1) ?: 1
    debugCountMap[name]?.let {
        debugLog(name, it)
        return it
    }
    return 1
}