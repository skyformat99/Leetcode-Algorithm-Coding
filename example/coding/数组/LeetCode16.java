import java.util.Arrays;

/**
 * @Description: <最接近的三数之和>
 * @Author: iByte
 * @Date: 2019-08-05 10:32
 * @Version: v2.0.0
 */
public class LeetCode16 {

    /**
     * 最接近的三数之和
     *
     * 总和问题，先排序降低计算复杂度，然后双指针比较
     *
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {
        //降低复杂度,顺序排序
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        //双指针轮询
        for (int i = 0; i < nums.length; i++) {
            //双指针指定
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int sum = nums[start] + nums[i] + nums[end];
                // 计算三数总和与目标值的绝对值,比较相差量
                if (Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if (sum > target)
                    end--;
                else if (sum < target)
                    start++;
                else
                    return ans;
            }
        }
        return ans;
    }
}
