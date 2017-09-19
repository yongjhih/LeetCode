package com.github.yongjhih;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MainTests {

    @Test
    public void test1() {
        assertTrue(new Solution().isPalindromeL(121));
    }

    @Test
    public void test2() {
        assertFalse(new Solution().isPalindromeL(123));
    }

    @Test
    public void test3() {
        assertFalse(new Solution().isPalindromeL(-121));
    }

    @Test
    public void test4() {
        assertTrue(new Solution().isPalindromeL(313));
    }

    @Test
    public void test5() {
        assertTrue(new Solution().isPalindrome(1001));
    }

    @Test
    public void test6() {
        assertFalse(new Solution().isPalindromeL(7463847412L));
    }

    @Test
    public void test21() {
        assertTrue(new Solution2().isPalindrome(121));
    }

    @Test
    public void test22() {
        assertFalse(new Solution2().isPalindrome(123));
    }

    @Test
    public void test23() {
        assertFalse(new Solution2().isPalindrome(-121));
    }

    @Test
    public void test24() {
        assertTrue(new Solution2().isPalindrome(313));
    }

    @Test
    public void test25() {
        assertFalse(new Solution2().isPalindrome(7463847412L));
    }

    @Test
    public void test26() {
        assertTrue(new Solution2().isPalindrome(1001));
    }

    @Test
    public void test31() {
        assertTrue(new Solution3().isPalindromeL(121));
    }

    @Test
    public void test32() {
        assertFalse(new Solution3().isPalindromeL(123));
    }

    @Test
    public void test33() {
        assertFalse(new Solution3().isPalindromeL(-121));
    }

    @Test
    public void test34() {
        assertTrue(new Solution3().isPalindromeL(313));
    }

    @Test
    public void test35() {
        assertTrue(new Solution3().isPalindrome(1001));
    }

    @Test
    public void test36() {
        assertFalse(new Solution3().isPalindromeL(7463847412L));
    }

    @Test
    public void testReverse() {
        System.out.println(Solution4.reverse(123));
        assertTrue(Solution4.reverse(123) == 321);
    }

    @Test
    public void testReverse2() {
        assertTrue(Solution4.reverse(12321) == 12321);
    }

    @Test
    public void testReverse3() {
        assertTrue(Solution4.reverse(313) == 313);
    }

    @Test
    public void testReverse4() {
        System.out.println(Solution4.reverse(-321));
        assertTrue(Solution4.reverse(-321) == -123);
    }

    @Test
    public void test37() {
        assertTrue(new Solution4().isPalindrome(121));
    }

    @Test
    public void test38() {
        assertFalse(new Solution4().isPalindrome(123));
    }

    @Test
    public void test39() {
        assertTrue(new Solution4().isPalindrome(-121));
    }

    @Test
    public void test40() {
        assertTrue(new Solution4().isPalindrome(313));
    }
}
