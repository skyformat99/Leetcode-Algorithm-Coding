import jdk.nashorn.internal.parser.JSONParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: <>
 * @Author: lishangzhi
 */
public class LeetCode15 {

    /**
     * 三元组
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums); // 排序->动态思维相加
        int len = nums.length;
        if (nums == null || len < 3) return ans;
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 已经经过排序，如果连续数值相同，一定会出现重复
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L + 1]) L++; // 去重
                    while (L < R && nums[R] == nums[R - 1]) R--; // 去重
                    L++;
                    R--;
                } else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }

    /**
     * 四元组
     *
     * @param nums
     * @param target
     * @return
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums); // 排序->动态思维相加

        int len = nums.length;
        // 四元数组
        if (nums == null || len < 4) return ans;
        for (int i = 0; i < len; i++) {
            if (nums[i] > target) break; // 如果当前数字大于target，则三数之和一定大于target，所以结束循环
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 已经经过排序，如果连续数值相同，一定会出现重复
            //设想第三个数在nums[L]与nums[R]之间
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                //确定nums[L]与nums[R]之间的数值
                for (int m = L; m < R - 1; i++) {
                    sum = sum + nums[m];
                    //与目标值相等
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[L], nums[m], nums[R]));
                        while (L < R - 1 && nums[L] == nums[L + 1]) L++; // 去重
                        while (L < R - 1 && nums[R] == nums[R - 1]) R--; // 去重
                        L++;
                        R--;
                    } else if (sum < target) L++;
                    else if (sum > target) R--;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] threeSum = new int[]{-1, 0, 1, 2, -1, -4};

        /**
         * [-1, 0, 1, 2, -1, -4]
         *
         * [
         *   [-1, 0, 1],
         *   [-1, -1, 2]
         * ]
         *
         */
        System.out.println(new LeetCode15().threeSum(threeSum));

        int[] fourSum = new int[]{1, 0, -1, 0, -2, 2};

        /**
         *
         * [1, 0, -1, 0, -2, 2]
         * ==> 排序后
         * [-2, -1, 0, 0, 1, 2]
         *
         *[
         *   [-1,  0, 0, 1],
         *   [-2, -1, 1, 2],
         *   [-2,  0, 0, 2]
         * ]
         *
         */
        System.out.println(new LeetCode15().fourSum(fourSum, 0));

    }
}
