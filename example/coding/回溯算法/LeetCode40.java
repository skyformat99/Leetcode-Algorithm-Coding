import java.util.*;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/9
 * @Description: <组合总和 II>
 * @link https://leetcode-cn.com/problems/combination-sum-ii/
 */
public class LeetCode40 {

    //数据集合
    private List<List<Integer>> ans = new ArrayList<List<Integer>>();

    /**
     * @param candidates 指定数组
     * @param target     目标总数
     * @return
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        //组合过程集合
        List<Integer> cans = new ArrayList<Integer>();
        Arrays.sort(candidates);
        if (target < candidates[0])
            return ans;

        backtrack(candidates, target, 0, 0, cans);

        //由于candidates存在重复数字，ans一定会存在重复集合，利用set集合特性去重
        Set<List<Integer>> set = new HashSet<>(ans);
        ans = new ArrayList<>(set);
        return ans;
    }

    /**
     * 回溯算法
     *
     * @param tatget 目标总数
     * @param sum    当前总数
     * @param cans   组合过程集合
     * @param index  下标
     */
    private void backtrack(int[] candidates, int tatget, int sum, int index, List<Integer> cans) {

        //确定结束点
        if (tatget == 0) {
            ans.add(new ArrayList<Integer>(cans));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] <= tatget) {
                //加上数值
                cans.add(candidates[i]);
                backtrack(candidates, tatget - candidates[i], sum, i + 1, cans);
                //减去数值
                cans.remove(cans.size() - 1);
            } else {
                return;
            }

        }

    }

    public static void main(String[] args) {
        LeetCode40 leetCode = new LeetCode40();
        leetCode.combinationSum2(new int[]{2,5,2,1,2}, 5);
    }
}
