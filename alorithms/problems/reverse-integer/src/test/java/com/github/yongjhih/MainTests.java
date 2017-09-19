package com.github.yongjhih;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MainTests {

    @Test
    public void testReverse() {
        System.out.println(new Solution().reverse(123));
        assertTrue(new Solution().reverse(123) == 321);
    }

    @Test
    public void testReverse2() {
        assertTrue(new Solution().reverse(12321) == 12321);
    }

    @Test
    public void testReverse3() {
        assertTrue(new Solution().reverse(313) == 313);
    }

    @Test
    public void testReverse4() {
        System.out.println(new Solution().reverse(-321));
        assertTrue(new Solution().reverse(-321) == -123);
    }
}
