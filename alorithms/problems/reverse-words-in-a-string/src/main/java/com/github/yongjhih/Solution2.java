package com.github.yongjhih;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution2 {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
}
