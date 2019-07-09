package com.github.lishangzhi.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/3
 * @Description: <>
 * @Version: v2.0.0
 * @Copy: 深圳市蓝凌软件股份有限公司
 */
public class No78 {

    public int uniquePaths(int m, int n) {
        int[] cur = new int[n];
        Arrays.fill(cur, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                cur[j] += cur[j - 1];
            }
        }
        return cur[n - 1];
    }

//    public static void main(String[] args) {
//        int[] cur = new int[3];
//        Arrays.fill(cur,1);
//        System.out.println(cur[0]);
//    }

    /**
     *
     *  a s d f f
     *  . s d f f
     *
     *
     *
     */

    public boolean isMatch(String text, String pattern) {
        // pattern 为空不进行匹配
        if (pattern.isEmpty()) return text.isEmpty();

        //找到回溯点 即:满足最简单匹配模式，第一个字符完全相同或者第一个p字符为.
        boolean first_match = (!text.isEmpty() && (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));


        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            return (isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    public static void main(String[] args) {
        String s = "adbcdef";
        System.out.println(s.substring(1));
    }
}
