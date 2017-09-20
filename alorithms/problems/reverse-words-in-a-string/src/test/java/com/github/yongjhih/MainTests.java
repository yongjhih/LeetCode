package com.github.yongjhih;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

public class MainTests {
    @Test
    public void test() {
        assertEquals(new Solution().reverseWords(" the sky is blue "), "blue is sky the");
    }

    @Test
    public void test2() {
        assertEquals(new Solution2().reverseWords(" the sky is blue "), "blue is sky the");
    }

    @Test
    public void test3() {
        System.out.println(new Solution3().reverseWords(" the sky is blue "));
        assertEquals(new Solution3().reverseWords(" the sky is blue "), "blue is sky the");
    }
}
