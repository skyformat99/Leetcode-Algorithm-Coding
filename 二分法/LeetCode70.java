/**
 * @Description: <>
 * @Author: iByte
 * @Date: 2019-08-05 17:31
 */
public class LeetCode70 {

    /**
     * @param n
     * @return
     */
    public int climbStairs(int n) {
       return  climb_Stairs(0, n);
    }

    /**
     * @param i
     * @param n
     * @return
     */
    public int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }


    /**
     * 动态规划方式实现
     *
     * @param n
     * @return
     */
    public int solution(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new LeetCode70().climbStairs(2));
    }
}
