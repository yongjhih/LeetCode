package com.github.yongjhih;

public class Solution3 {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        return isPalindromeL(x);
    }

    boolean isPalindromeL(long x) {
        return Long.valueOf(reverse(x)).equals(x);
    }

    long reverse(long x) {
        return reverse(x, 0);
    }

    long reverse(long x, long p) {
        System.out.println(x + "|" + p);
        p *= 10;
        p += x % 10;
        if (x < 10) return p;
        return reverse(x / 10, p);
    }

    public static void main(String[] args) {
        System.out.println("" + new Solution().isPalindrome(Integer.valueOf(args[0])));
    }
}
