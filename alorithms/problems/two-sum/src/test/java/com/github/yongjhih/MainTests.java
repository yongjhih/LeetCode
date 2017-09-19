package com.github.yongjhih;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MainTests {

    @Test
    public void test() {
        int[] r = new Solution().twoSum(new int[]{2, 7, 11, 15}, 9);
        assertTrue(r[0] == 0);
        assertTrue(r[1] == 1);
    }

    @Test
    public void test2() {
        int[] r = new Solution().twoSum(new int[]{11, 2, 1, 11, 7}, 9);
        assertTrue(r[0] == 1);
        assertTrue(r[1] == 4);
    }
}
