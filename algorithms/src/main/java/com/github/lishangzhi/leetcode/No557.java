package com.github.lishangzhi.leetcode;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/1
 * @Description: <>
 * @Version: v2.0.0
 * @describe 557. 反转字符串中的单词 III
 * @link https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * <p>
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 */
public class No557 {


    public static void main(String[] args) {
        String soure = "Let's take LeetCode contest";
        System.out.println(reverseWords2(soure));
    }

    public static String reverseWords1(String soure) {
        String target = "";
        //字符串拆分成数组
        String[] temp = soure.split(" ");
        for (int i = 0; i < temp.length; i++) {
            // 利用StringBuffer.reverse() 将字符逆序
            if (i == temp.length - 1) {
                target = target + new StringBuffer(temp[i]).reverse().toString();
            } else {
                target = target + new StringBuffer(temp[i]).reverse().append(" ").toString();
            }

        }
        return target;
    }

    public static String reverseWords2(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        /**
         * 划分子数组
         * 子数组双指针交换；
         * 生成字符串
         */
        char[] arr = s.toCharArray();
        int l = 0;
        int r = 0;
        //
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                while (l < r) {
                    char t = arr[l];
                    arr[l] = arr[r];
                    arr[r] = t;
                    l++;
                    r--;
                }
                l = i + 1;
                r = i + 1;
            } else {
                r = i;
            }
        }
        while (l < r) {
            char t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
        return new String(arr);
    }

}
