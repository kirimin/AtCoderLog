import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem209a(a,b))
}

fun problem209a(a: Int, b: Int): Int {
    return (a..b).count()
}