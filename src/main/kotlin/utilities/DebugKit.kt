package utilities

import java.text.NumberFormat

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

var speedMeasurementMap = mutableMapOf<String, Long>()
fun debugSpeedStart(name: String = "speed") {
    speedMeasurementMap[name] = System.nanoTime()
}

val numberFormat: NumberFormat = NumberFormat.getNumberInstance()
fun debugSpeedEnd(name: String = "speed") {
    debugLog(
        name,
        (numberFormat.format(System.nanoTime() / 1000 - speedMeasurementMap[name]!! / 1000)).toString() + "µs"
    )
}