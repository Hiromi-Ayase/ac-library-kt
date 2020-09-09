package jp.atcoder.library.kotlin.fenwickTree

import org.junit.Assert.*
import org.junit.Test

class FenwickTreeTest {
    @Test
    fun fenwickTreeTest() {
        val ft = FenwickTree(10)
        assertEquals(0, ft.sum(0, 10))

        ft.add(1, 5)
        ft.add(2, 4)
        ft.add(9, 3)
        assertEquals(12, ft.sum(0, 10))
        assertEquals(5, ft.sum(0, 2))
        assertEquals(9, ft.sum(0, 3))
        assertEquals(9, ft.sum(0, 4))
    }

    @Test
    fun fenwickTreeFromArrayTest() {
        val array = longArrayOf(2, 3, 4, 1)
        val ft = FenwickTree(array)

        assertEquals(5, ft.sum(0, 2))
        assertEquals(10, ft.sum(0, 4))
    }
}
