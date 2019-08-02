import com.sun.xml.internal.ws.util.StringUtils;

/**
 * @Description: <>
 * @Author: lishangzhi
 */
public class LeetCode20 {

    /**
     * 判断有效字符串
     *
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        //连续闭合纠正
        char[] ans = s.toCharArray();
        if (ans == null) return false;
        return recursion(ans,0);
    }

    public boolean recursion(char[] ans, int index) {
        if (index == ans.length) return true;
        if (ans[index] == '(' && ans[index + 1] == ')') {
            index = index + 2;
            recursion(ans, index);
        }else {
            return false;
        }
        if (index == ans.length) return true;
        if (ans[index] == '{' && ans[index + 1] == '}') {
            index = index + 2;
            recursion(ans, index);
        }else {
            return false;
        }
        if (index == ans.length) return true;
        if (ans[index] == '[' && ans[index + 1] == ']') {
            index = index + 2;
            recursion(ans, index);
        }else {
            return false;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new LeetCode20().isValid("()[]{}"));
    }
}
