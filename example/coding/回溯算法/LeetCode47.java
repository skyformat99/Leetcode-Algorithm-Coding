import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/12
 * @Description: <全排列 II>
 *
 * @link https://leetcode-cn.com/problems/permutations-ii/
 */
public class LeetCode47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> output = new HashSet<>();

        ArrayList<Integer> nums_lst = new ArrayList<Integer>();

        for (int num : nums)
            nums_lst.add(num);

        int n = nums.length;
        backtrack(n,nums_lst,output,0);

        return new ArrayList<>(output);
    }

    public void backtrack(int n,
                          ArrayList<Integer> nums,
                          HashSet<List<Integer>> output,
                          int first) {
        if (first == n)
            output.add(new ArrayList<Integer>(nums));
        for (int i = first; i < n; i++) {
            Collections.swap(nums, first, i);
            backtrack(n, nums, output, first + 1);
            Collections.swap(nums, first, i);
        }
    }


}
