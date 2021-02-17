package leetcode

/**
 * Stack as type alias of Mutable List
 */
typealias Stack<T> = MutableList<T>

/**
 * Pushes item to [Stack]
 * @param item Item to be pushed
 */
inline fun <T> Stack<T>.push(item: T) = add(item)

/**
 * Pops (removes and return) last item from [Stack]
 * @return item Last item if [Stack] is not empty, null otherwise
 */
fun <T> Stack<T>.pop(): T? = if (isNotEmpty()) removeAt(lastIndex) else null

/**
 * Peeks (return) last item from [Stack]
 * @return item Last item if [Stack] is not empty, null otherwise
 */
fun <T> Stack<T>.peek(): T? = if (isNotEmpty()) this[lastIndex] else null

class Solution2 {
    fun decodeString(s: String): String {
        if (s.isEmpty()) {
            return s
        }
        if (!s.contains("[")) { // or !containsDigit()
            return s
        }

        val stack = mutableListOf(StringBuilder())
        val int = StringBuilder()
        val intStack = mutableListOf<Int>()
        for (c in s) {
            if (c.isDigit()) {
                int.append(c)
            } else {
                if (c == '[') {
                    stack.push(StringBuilder())
                    intStack.push(int.toString().toInt())
                    int.clear()
                } else if (c == ']') {
                    val repeated = stack.pop()?.repeat(intStack.pop() ?: 1) ?: ""
                    stack.peek()?.append(repeated)
                } else {
                    stack.peek()?.append(c)
                }
            }
        }

        return stack.peek()?.toString() ?: ""
    }
}
