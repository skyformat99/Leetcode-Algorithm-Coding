package com.github.lishangzhi.leetcode;
import java.util.ArrayList;
import java.util.List;
/**
 * @Author: lishangzhi
 * @Date: 2019/7/8
 * @Description: <>
 * @Version: v2.0.0
 * @Copy: 深圳市蓝凌软件股份有限公司
 */
public class No39 {

    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();


        int sum = 0;
        List<Integer> list = new ArrayList<Integer>();
        backtrack(candidates, list, sum, target,0);
        return res;
    }

    private void backtrack(int[] candidates, List<Integer> list , int sum, int target,int index) {
        if (sum > target)
            return;
        if (sum == target) {
            res.add(list);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            List<Integer> t_list = new ArrayList<Integer>(list);
            t_list.add(candidates[i]);
            backtrack(candidates, t_list, sum + candidates[i], target,i);
        }

    }
}
