package leetcode 

import kotlin.test.assertEquals
import org.junit.Test

class TestSource {
    @Test fun solution() {
        val solution = Solution()
        assertEquals("abcabc", solution.decodeString("abc1[abc]"))
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"))
    }
    @Test fun solution2() {
        val solution = Solution2()
        assertEquals("abcabc", solution.decodeString("abc1[abc]"))
        assertEquals("abcabcabc", solution.decodeString("abc2[abc]"))
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"))
    }
}
