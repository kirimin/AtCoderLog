import abc.problem54b
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

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
}