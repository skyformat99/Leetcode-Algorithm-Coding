import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/12
 * @Description: <两数之和>
 */
public class LeetCode1 {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j){
                    if (nums[i] + nums[j] == target) {

                        return new int[]{i,j};
                    }
                }
            }
        }
        return null;
    }
}
