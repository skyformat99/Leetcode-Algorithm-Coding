/**
 * @Description: <斐波那契数>
 * @Author: iByte
 * @Date: 2019-08-05 19:51
 * @Version: v2.0.0
 */
public class LeetCodeFBNQ {

    /**
     * F(N) = F(N-1) + F(N-2)
     * F(0) = 0 ,F(1) = 1
     */

    /**
     * 步骤一: 暴力的递归算法
     */
    public int Fib1(int N) {
        if (N == 1 || N == 2) return 1;
        return Fib1(N - 1) + Fib1(N - 2);
    }

}
