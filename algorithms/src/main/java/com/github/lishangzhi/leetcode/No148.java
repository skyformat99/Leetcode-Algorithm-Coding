package com.github.lishangzhi.leetcode;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/3
 * @Description: <>
 * @Link https://leetcode-cn.com/problems/sort-list/
 */
public class No148 {


    /**
     * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 4->2->1->3
     * 输出: 1->2->3->4
     * 示例 2:
     * <p>
     * 输出: -1->0->3->4->5
     * 输入: -1->5->3->4->0
     */

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
