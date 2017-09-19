package com.github.yongjhih;

public class Solution4 {
    public boolean isPalindrome(int x) {
        return reverse(x) == x;
    }

    public static int reverse(int x) {
        if ((x / 10) == 0) return x;
        int r = 0;
        while (x != 0) {
            r *= 10;
            r += x % 10;
            x /= 10;
        }
        return r;
    }
}
