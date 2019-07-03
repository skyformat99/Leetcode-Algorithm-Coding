package com.github.lishangzhi.leetcode;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/2
 * @Description: <>
 */
public class No44 {

    /**
     * @link https://leetcode-cn.com/problems/wildcard-matching/
     * 给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。
     * <p>
     * '?' 可以匹配任何单个字符。
     * '*' 可以匹配任意字符串（包括空字符串）。
     */


    /***
     * 在代码里解释.
     *
     * 时间复杂度为:O(mn)O(mn)
     *
     * 思路二: 动态规划
     *
     * dp[i][j]表示s到i位置,p到j位置是否匹配!
     *
     * 初始化:
     *
     * dp[0][0]:什么都没有,所以为true
     * 第一行dp[0][j],换句话说,s为空,与p匹配,所以只要p开始为*才为true
     * 第一列dp[i][0],当然全部为False
     * 动态方程:
     *
     * 如果(s[i] == p[j] || p[j] == "?") && dp[i-1][j-1] ,有dp[i][j] = true
     *
     * 如果p[j] == "*" && (dp[i-1][j] = true || dp[i][j-1] = true)有dp[i][j] = true
     *
     * ​	note:
     *
     * ​	dp[i-1][j],表示*代表是空字符,例如ab,ab*
     *
     * ​	dp[i][j-1],表示*代表非空任何字符,例如abcd,ab*
     *
     */

    /**
     * 动态规划
     *
     * @param text
     * @param pattern
     * @return
     */
    public static boolean isMatch(String text, String pattern) {
        // 多一维的空间，因为求 dp[len - 1][j] 的时候需要知道 dp[len][j] 的情况，
        // 多一维的话，就可以把 对 dp[len - 1][j] 也写进循环了
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        // dp[len][len] 代表两个空串是否匹配了，"" 和 "" ，当然是 true 了。
        dp[text.length()][pattern.length()] = true;

        // 从 len 开始减少
        for (int i = text.length(); i >= 0; i--) {
            for (int j = pattern.length(); j >= 0; j--) {
                // dp[text.length()][pattern.length()] 已经进行了初始化
                if (i == text.length() && j == pattern.length())
                    continue;
                //相比之前增加了判断是否等于 *
                boolean first_match = (i < text.length() && j < pattern.length() && (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '?' || pattern.charAt(j) == '*'));
                if (j < pattern.length() && pattern.charAt(j) == '*') {
                    //将 * 跳过 和将字符匹配一个并且 pattern 不变两种情况
                    dp[i][j] = dp[i][j + 1] || first_match && dp[i + 1][j];
                } else {
                    dp[i][j] = first_match && dp[i + 1][j + 1];
                }
            }
        }
        return dp[0][0];
    }


    public static boolean isMatch2(String str, String pattern) {
        int s = 0, p = 0, match = 0, starIdx = -1;
        //遍历整个字符串
        while (s < str.length()){
            // 一对一匹配，两指针同时后移。
            if (p < pattern.length()  && (pattern.charAt(p) == '?' || str.charAt(s) == pattern.charAt(p))){
                s++;
                p++;
            }
            // 碰到 *，假设它匹配空串，并且用 startIdx 记录 * 的位置，记录当前字符串的位置，p 后移
            else if (p < pattern.length() && pattern.charAt(p) == '*'){
                starIdx = p;
                match = s;
                p++;
            }
            // 当前字符不匹配，并且也没有 *，回退
            // p 回到 * 的下一个位置
            // match 更新到下一个位置
            // s 回到更新后的 match
            // 这步代表用 * 匹配了一个字符
            else if (starIdx != -1){
                p = starIdx + 1;
                match++;
                s = match;
            }
            //字符不匹配，也没有 *，返回 false
            else return false;
        }

        //将末尾多余的 * 直接匹配空串 例如 text = ab, pattern = a*******
        while (p < pattern.length() && pattern.charAt(p) == '*')
            p++;

        return p == pattern.length();
    }


    public static void main(String[] args) {
        String s = "aabbc";

        String p = "?a*";
        System.out.println(isMatch(s,p));
    }

}
