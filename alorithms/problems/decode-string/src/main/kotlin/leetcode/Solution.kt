package leetcode

class Solution {
    fun decodeString(s: String): String {
        if (s.isEmpty()) {
            return s
        }
        if (!s.contains("[")) { // or !containsDigit()
            return s
        }

        if (!s[0].isDigit()) { // O(n)
            for (i in s.indices) {
                if (!s[i].isLetter()) {
                    val letters = s.substring(0, i)
                    val remains = s.substring(i)
                    return "$letters${decodeString(remains)}"
                }
            }
        }

        // s.startWithDigit
        var digits = "0"
        var remains = ""
        var int = 0
        // O(n)
        for (i in s.indices) {
            if (!s[i].isDigit()) { // '['
                digits = s.substring(0, i)
                int = digits.toInt()
                remains = s.substring(i)
                break
            }
        }

        var stack = 0
        // O(n)
        for (i in remains.indices) { // '[...'
            if (remains[i] == '[') {
                stack++
            } else if (remains[i] == ']') {
                stack--
            }
            if (stack == 0) { // '[...]...'
                return "${decodeString(remains.substring(1, i).repeat(int))}${decodeString(remains.substring(i+1))}"
            }
        }
        return remains
    }
}
