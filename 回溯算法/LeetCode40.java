import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/9
 * @Description: <>
 * @Version: v2.0.0
 * @Copy: 深圳市蓝凌软件股份有限公司
 */
public class LeetCode40 {

    /**
     * @link https://leetcode-cn.com/problems/combination-sum-ii/
     */

    /**
     * @param candidates 指定数组
     * @param target     目标总数
     * @return
     */
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        //数据集合
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        //组合过程集合
        List<Integer> cans = new ArrayList<Integer>();

        backtrack(target, 0, 0, cans, ans);
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
    private void backtrack(int tatget, int sum, int index, List<Integer> cans, List<List<Integer>> ans) {

        //确定回溯点
        if (sum == tatget) {
            ans.add(cans);
            //未移除已经计算的数值
            return;
        }

        if (sum < tatget){

        }

    }
}
