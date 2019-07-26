/**
 * @Description: <翻转对>
 * @Author: lishangzhi
 * @Date: 2019-07-22 15:05
 * @link https://leetcode-cn.com/problems/reverse-pairs/
 */
public class Solution {

    //[2147483647,2147483647,2147483647,2147483647,2147483647,2147483647]

    /**
     * 给定一个数组 nums ，如果 i < j 且 nums[i] > 2*nums[j] 我们就将 (i, j) 称作一个重要翻转对
     *
     * @param nums
     * @return
     */
    public int reversePairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i < j && i!=j && nums[i] > 2*nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }

}
