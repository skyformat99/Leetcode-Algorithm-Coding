package com.github.lishangzhi.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/8
 * @Description: <>
 */
public class No22 {
    /**
     * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
     * <p>
     * 例如，给出 n = 3，生成结果为：
     * <p>
     * [
     * "((()))",
     * "(()())",
     * "(())()",
     * "()(())",
     * "()()()"
     * ]
     */

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, "", 0, 0, n);
        return null;
    }

    /**
     * @param ans       集合
     * @param cur       字符长度
     * @param open      左括号
     * @param close     左括号
     * @param max       括号对数
     */
    public void backtrack(List<String> ans, String cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }
        if (open < max)
            backtrack(ans, cur + "(", open + 1, close, max);
        if (close < open)
            backtrack(ans, cur + ")", open, close + 1, max);
    }
}
