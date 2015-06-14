package com.github.yongjhih;

public class Solution {
    public boolean isPalindrome(int x) {
        return isPalindromeL(x);
    }

    public boolean isPalindromeL(long x) {
        if (x == 0) return true;
        if (x < 0) return false;
        if (x / 10 == 0) return true;

        long i = x;
        long x2 = 0;

        while (i > 0) {
            x2 = x2 * 10 + i % 10;
            i = i / 10;
        }
        return x2 == x;
    }

    public static void main(String[] args) {
        System.out.println("" + new Solution().isPalindrome(Integer.valueOf(args[0])));
    }
}
