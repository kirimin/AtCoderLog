import abc.problem54b
import org.junit.Assert
import org.junit.Test

class TestOf054 {

    @Test
    fun testOf_054_a() {
        Assert.assertEquals(abc.problem54a(8, 6), "Alice")
        Assert.assertEquals(abc.problem54a(1, 1), "Draw")
        Assert.assertEquals(abc.problem54a(13, 1), "Bob")
    }

    @Test
    fun testOf_054_b() {
        Assert.assertEquals(
            problem54b(
                aList = listOf("#.#", ".#.", "#.#"),
                bList = listOf("#.", ".#")
            ), "Yes"
        )

        Assert.assertEquals(
            problem54b(
                aList = listOf("....", "....", "....", "...."),
                bList = listOf("#")
            ), "No"
        )

        Assert.assertEquals(
            problem54b(
                aList = listOf("....", "....", "....", "..##"),
                bList = listOf("##")
            ), "Yes"
        )

        Assert.assertEquals(
            problem54b(
                aList = listOf("....", "....", "....", ".##."),
                bList = listOf("##")
            ), "Yes"
        )

        Assert.assertEquals(
            problem54b(
                aList = listOf("....", "....", "....", "##.."),
                bList = listOf("##")
            ), "Yes"
        )
    }
}