package com.github.yongjhih;

class Solution3 {
    fun reverseWords(s: String): String {
        return s.trim().split(Regex("\\s+")).reversed().joinToString(" ")
    }
}
