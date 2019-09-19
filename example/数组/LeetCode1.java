import java.util.HashMap;

/**
 * @Description: <两数之和>
 * @Author: iByte
 * @Date: 2019-08-05 11:12
 */
public class LeetCode1 {

    /**
     * 两数之和
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (ans.containsKey(complement)) {
                return new int[]{i, ans.get(complement)};
            }
            //全部放进去
            ans.put(nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] sum = new int[]{1, 2, 3, 4};
        int target = 3;
        /**
         * nums = [2, 7, 11, 15], target = 9
         */
        System.out.println(new LeetCode1().twoSum(sum, target));
    }


}
