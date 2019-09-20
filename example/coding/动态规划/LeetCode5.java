import java.util.HashMap;
import java.util.Map;

/**
 * @Description: <>
 */
public class LeetCode5 {

    /**
     * 滑动窗口策略
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
//        int n = s.length(), ans = 0;
//        Map<Character, Integer> map = new HashMap<>();
//        for (int j = 0, i = 0; j < n; j++) {
//            if (map.containsKey(s.charAt(j))) {
//                i = Math.max(map.get(s.charAt(j)), i);
//            }
//            ans = Math.max(ans, j - i + 1);
//
//            map.put(s.charAt(j), j + 1);
//        }
        return null;
    }


    public String longestPalindrome2(String s) {
        int len = s.length();
        if (len <= 1) {
            return s;
        }
        int longestPalindrome = 1;
        String longestPalindromeStr = s.substring(0, 1);
        boolean[][] dp = new boolean[len][len];
        // abcdedcba
        //   l   r
        // 如果 dp[l, r] = true 那么 dp[l + 1, r - 1] 也一定为 true
        // 关键在这里：[l + 1, r - 1] 一定至少有 2 个元素才有判断的必要
        // 因为如果 [l + 1, r - 1] 只有一个元素，不用判断，一定是回文串
        // 如果 [l + 1, r - 1] 表示的区间为空，不用判断，也一定是回文串
        // [l + 1, r - 1] 一定至少有 2 个元素 等价于 l + 1 < r - 1，即 r - l >  2

        // 写代码的时候这样写：如果 [l + 1, r - 1]  的元素小于等于 1 个，即 r - l <=  2 ，就不用做判断了

        // 因为只有 1 个字符的情况在最开始做了判断
        // 左边界一定要比右边界小，因此右边界从 1 开始
        for (int r = 1; r < len; r++) {
            for (int l = 0; l < r; l++) {
                // 区间应该慢慢放大
                // 状态转移方程：如果头尾字符相等并且中间也是回文
                // 在头尾字符相等的前提下，如果收缩以后不构成区间（最多只有 1 个元素），直接返回 True 即可
                // 否则要继续看收缩以后的区间的回文性
                // 重点理解 or 的短路性质在这里的作用
                if (s.charAt(l) == s.charAt(r) && (r - l <= 2 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > longestPalindrome) {
                        longestPalindrome = r - l + 1;
                        longestPalindromeStr = s.substring(l, r + 1);
                    }
                }
            }
        }
        return longestPalindromeStr;
    }
}
