package jp.atcoder.library.kotlin.modInt

import jp.atcoder.library.kotlin.fenwickTree.FenwickTree
import org.junit.Assert
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class FenwickTreeTest {
    @Test
    fun modIntTest1e9_7() {
        val factory = ModIntFactory(1e9.toInt() + 7)
        val a = factory.create(107)
        val b = factory.create(109)

        // Simple multiplication.
        assertEquals(factory.create(109 * 107), a.mul(b))

        // Inverse.
        val c = a.mul(a.inv())
        assertEquals(factory.create(1), c)

        // Overflow test.
        assertTrue(a.pow(10000).value() > 0)
    }
}