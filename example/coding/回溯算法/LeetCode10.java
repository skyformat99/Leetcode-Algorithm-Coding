/**
 * @Author: lishangzhi
 * @Date: 2019/7/9
 * @Description: <正则表达式匹配>
 * @link https://leetcode-cn.com/problems/regular-expression-matching/
 */
public class LeetCode10 {

    /**
     * '.' 匹配任意单个字符
     * '*' 匹配零个或多个前面的那一个元素
     *
     * @param text    字符串
     * @param pattern 字符规则
     * @return
     */
    public boolean isMatch(String text, String pattern) {
        //如果字符规则为空,则不存在匹配
        if (pattern.isEmpty()) return text.isEmpty();

        boolean first_match = (!text.isEmpty() && (text.charAt(0) == pattern.charAt(0) || pattern.charAt(0) == '.'));

        if (text.length() >= 2 && pattern.charAt(1) == '*') {
            return (isMatch(text, pattern.substring(2)) || (first_match && isMatch(text.substring(1), pattern)));
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1));
        }
    }

    public static void main(String[] args) {
        LeetCode10 leetCode = new LeetCode10();
        leetCode.isMatch("", "");
    }
}