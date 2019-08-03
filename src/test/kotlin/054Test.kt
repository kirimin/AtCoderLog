import abc.problem54b
import abc.problem54c
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TestOf054 {

    @Test
    fun testOf_054_a() {
        assertEquals("Alice", abc.problem54a(8, 6))
        assertEquals("Draw", abc.problem54a(1, 1))
        assertEquals("Bob", abc.problem54a(13, 1))
    }

    @Test
    fun testOf_054_b() {
        assertEquals(
            "Yes",
            problem54b(
                aList = listOf("#.#", ".#.", "#.#"),
                bList = listOf("#.", ".#")
            )
        )

        assertEquals(
            "No",
            problem54b(
                aList = listOf("....", "....", "....", "...."),
                bList = listOf("#")
            )
        )

        assertEquals(
            "Yes",
            problem54b(
                aList = listOf("....", "....", "....", "..##"),
                bList = listOf("##")
            )
        )

        assertEquals(
            "Yes",
            problem54b(
                aList = listOf("....", "....", "....", ".##."),
                bList = listOf("##")
            )
        )

        assertEquals(
            "Yes",
            problem54b(
                aList = listOf("....", "....", "....", "##.."),
                bList = listOf("##")
            )
        )
    }

    @ParameterizedTest
    @CsvSource(
        "3, 3, '1 1 2', '3 2 3', 2",
        "7, 7, '1 2 3 4 5 6', '3 7 4 5 6 6 7', 1"
    )
    fun testOf_054_c(n: Int, m: Int, ab: String, expected: Int) {
        val aList = ab.split(" ").map { it.toInt() }
        val bList = ab.split(" ").map { it.toInt() }
        println(aList)
        assertEquals(expected, problem54c(n, m, aList, bList))
    }
}