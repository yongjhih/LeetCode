package leetcode

class Solution {
    /*
    ```java
    public List<List<Integer>> generate(int numRows) {
        return generateHelper(new ArrayList<List<Integer>>(), numRows);
    }
    private List<List<Integer>> generateHelper(List<List<Integer>> tri, int numRows) {
        if (numRows == 0) {
            // base case
            return tri;
        }

        List<Integer> newList = new ArrayList<Integer>();
        newList.add(1);
        if (tri.size() != 0) {
            // compute pascal triangle
            List<Integer> lastList = tri.get(tri.size() - 1);
            for (int i = 0; i < lastList.size() - 1; i++) {
                int curr = lastList.get(i);
                int next = lastList.get(i + 1);
                newList.add(curr + next);
            }
            newList.add(1);
        }
        tri.add(newList);
        return generateHelper(tri, numRows - 1);
    }
    ```
     */
    fun generate(numRows: Int): List<List<Int>> {
        return generate(mutableListOf(), numRows)
    }

    fun generate(result: MutableList<List<Int>>, numRows: Int): List<List<Int>> {
        if (result.size >= numRows) {
            return result
        }
        if (result.isEmpty()) {
            result.add(listOf(1))
            return generate(result, numRows)
        }

        val row = mutableListOf<Int>()
        row.add(1)
        for (i in result.last().indices) {
            if (i == result.last().lastIndex) {
                break
            }
            row.add(result.last()[i] + result.last()[i+1])
        }
        row.add(1)
        result.add(row)

        return generate(result, numRows)
    }
}
