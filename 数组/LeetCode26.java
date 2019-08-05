import java.util.*;

/**
 * @Description: <删除排序数组中的重复项>
 * @Author: iByte
 * @Date: 2019-08-05 11:37
 * @Version: v2.0.0
 */
public class LeetCode26 {

    public int removeDuplicates1(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public int removeDuplicates2(int[] nums) {
        //给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素最多出现两次，返回移除后数组的新长度
        //有序数组，有序...有序
        int i = 0;
        for (int n : nums){
            if (i < 2 || n != nums[i-2]){
                nums[i] = n;
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        System.out.println(new LeetCode26().removeDuplicates2(nums));
    }

}
