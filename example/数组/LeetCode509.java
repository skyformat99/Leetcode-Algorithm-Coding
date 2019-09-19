/**
 * @Description: <>
 * @Author: iByte
 * @Date: 2019-08-05 18:58
 */
public class LeetCode509 {

    /**
     * 斐波那契数
     *
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2)
     *
     * @param N
     * @return
     */
    public int fib(int N) {
        int curr = 0, next = 1;
        while (N-- > 0) {
            next = next + curr;
            curr = next - curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode509().fib(5));
    }
}
