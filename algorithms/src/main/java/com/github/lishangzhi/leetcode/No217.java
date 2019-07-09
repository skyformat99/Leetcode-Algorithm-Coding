package com.github.lishangzhi.leetcode;

import com.github.lishangzhi.test.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/3
 * @Description: <>
 * @Version: v2.0.0
 * @Copy: 深圳市蓝凌软件股份有限公司
 */
public class No217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> visited = new HashSet<Integer>();
        for (int num : nums) {
            visited.add(num);
        }
        if (visited.size() == nums.length) {
            return false;
        } else {
            return true;
        }
    }
}
