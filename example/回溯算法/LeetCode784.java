import java.util.*;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/10
 * @Description: <字母大小写全排列>
 * @link https://leetcode-cn.com/problems/letter-case-permutation/
 */
public class LeetCode784 {

    /**
     * 字母大小写全排列
     *
     * @param S 长度不超过12。仅由数字和字母组成。
     * @return
     */
    public List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        backtrack(res, S.toCharArray(), 0);

        return  res;
    }

    /**
     * 指定一个字符大小写转化
     *
     * @param soure 字符串
     * @param index 下标值
     */
    public void backtrack(List<String> res, char[] soure, int index) {
        char[] soure_tmp = soure;
        if (index == soure.length) {
            res.add(new String(soure));
            return;
        }
//        if (!Character.isDigit(soure[index])) {
//            backtrack(res, soure, index + 1);
//            if (Character.isUpperCase(soure[index])) {
//                //当前字符转化为小写
//                soure_tmp[index] = Character.toLowerCase(soure[index]);
//                backtrack(res, soure_tmp, index + 1);
//            } else {
//                //当前字符转化为大写
//                soure_tmp[index] = Character.toUpperCase(soure[index]);
//                backtrack(res, soure_tmp, index + 1);
//            }
//        }else{
//            backtrack(res, soure_tmp, index + 1);
//        }
        backtrack(res, soure, index + 1);
        if(!Character.isDigit(soure[index])){
            soure[index]^=(1<<5);
            backtrack(res, soure, index + 1);
        }

    }

    public static void main(String[] args) {
//        LeetCode784 leetCode = new LeetCode784();
//        leetCode.letterCasePermutation("A2s");

        int a =  8 >>2;
        int b = -8 >> 2;
        System.out.println(a);
        System.out.println(b);


    }
}
