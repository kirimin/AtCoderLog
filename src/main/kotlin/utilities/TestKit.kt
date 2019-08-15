package utilities

fun toLongList(str: String) = str.split(" ").map { it.toLong() }

fun toIntList(str: String) = str.split(" ").map { it.toInt() }