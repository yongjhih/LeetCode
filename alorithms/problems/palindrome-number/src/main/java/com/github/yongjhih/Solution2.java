package com.github.yongjhih;

public class Solution2 {
    public boolean isPalindrome(long x) {
        if (x == 0) return true;
        if (x < 0) return false;

        return reverse(Long.valueOf(x)).equals(Long.valueOf(x));
    }

    String reverseToString(Long x) {
        if (x < 10) return String.valueOf(x);

        return String.valueOf(x % 10) + String.valueOf(reverseToString(x / 10));
    }

    Long reverse(Long x) {
        return Long.valueOf(reverseToString(x));
    }
}
