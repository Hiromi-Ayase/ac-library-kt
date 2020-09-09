package jp.atcoder.library.kotlin.stringAlgorithms

import jp.atcoder.library.kotlin.stringAlgorithm.StringAlgorithm
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class StringAlgorithmTest {
    @Test
    fun lcpTest() {
        val str = "abracadabra"
        val sa = StringAlgorithm.suffixArray(str)
        val lcp = StringAlgorithm.lcpArray(str, sa)

        assertArrayEquals(intArrayOf(10, 7, 0, 3, 5, 8, 1, 4, 6, 9, 2), sa)
        assertArrayEquals(intArrayOf(1, 4, 1, 1 ,0, 3, 0, 0, 0, 2), lcp)
    }
}
