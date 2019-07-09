package com.github.lishangzhi.leetcode;

import javax.sound.midi.Soundbank;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/3
 * @Description: <>
 * @Version: v2.0.0
 * @Copy: 深圳市蓝凌软件股份有限公司
 */
public class No238 {

    /**
     * 给定长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。
     * <p>
     * 示例:
     * <p>
     * 输入: [1,2,3,4]
     * 输出: [24,12,8,6]
     *
     * @param nums
     * @return
     */
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] outputs = new int[len];
        // 避免下标越界先计算数组左边
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                outputs[i] = 1;
            } else {
                outputs[i] = outputs[i - 1] * nums[i - 1];
            }
        }
        //在依次处理数组右边
        int rightMulti = 1;
        for (int i = len - 1; i >= 0; i--) {
            outputs[i] *= rightMulti;
            rightMulti *= nums[i];
        }
        return outputs;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int[] res = productExceptSelf(input);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
