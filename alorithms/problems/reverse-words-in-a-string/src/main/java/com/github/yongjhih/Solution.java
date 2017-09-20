package com.github.yongjhih;

import java.util.*;

public class Solution {
    public String reverseWords(String s) {
        String[] strings = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = strings.length - 1; i >= 0; i--) {
            sb.append(strings[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
