import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/12
 * @Description: <第k个排列>
 * @link https://leetcode-cn.com/problems/permutation-sequence/
 */
public class LeetCode60 {

    /**
     * 生成基本字符串
     *
     * @param n
     * @param k
     * @return
     */
    public static String getPermutation(int n, int k) {
        StringBuffer baseStr = new StringBuffer();
        StringBuffer str = new StringBuffer();

        for (int i = 1; i <= n; i++) baseStr.append(i);

        if (k > factorial(n)) return "";

        return doCount(n, k - 1, baseStr, str).toString();
    }

    /**
     * 根据公式生成字符串
     *
     * @param n
     * @param k
     * @param baseStr
     * @param str
     * @return
     */
    public static StringBuffer doCount(int n, int k, StringBuffer baseStr, StringBuffer str) {

        if (n == 1) return str.append(baseStr);

        Integer fac = factorial(n - 1);
        int index = k / fac;//获取当前位置的字符
        str.append(baseStr.charAt(index));
        baseStr.deleteCharAt(index);
        return doCount(n - 1, k % fac, baseStr, str);
    }

    /**
     * 阶乘计算公式
     *
     * @param n
     * @return
     */
    public static Integer factorial(int n) {
        if (n <= 0) return 0;
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        System.out.println(LeetCode60.getPermutation(3,3));
    }
}
