/**
 * @Description: <>
 * @Author: lishangzhi
 */
public class LeetCode9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            char[] ans = String.valueOf(x).toCharArray();
            for (int i = 0; i < ans.length / 2; i++) {
                int j = ans[i];
                ans[i] = ans[ans.length - i - 1];
                ans[ans.length - i - 1] = ans[i];
            }
            return (Integer.valueOf(ans.toString())==x);
        }
    }

    public static void main(String[] args) {
        System.out.println(new LeetCode9().isPalindrome(121));
    }
}
