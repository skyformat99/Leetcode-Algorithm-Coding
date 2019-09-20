/**
 * @Description: <二分法解题- 在排序数组中查找元素的第一个和最后一个位置>
 * @Author: iByte
 * @Date: 2019-08-05 15:51
 */
public class LeetCode34 {

    /**
     * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。
     * 找出给定目标值在数组中的开始位置和结束位置。
     * <p>
     * 算法时间复杂度必须是 O(log n) 级别
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            //边界值
            if (nums[mid] == target) {

            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }


        }
        return nums;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 5;
        System.out.println(new LeetCode34().searchRange(nums, target));
    }


    public int Solution(int numa,int numb){
        return numa+numb;
    }
}
