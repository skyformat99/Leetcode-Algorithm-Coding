package com.github.lishangzhi.test;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/3
 * @Description: <>
 * @Version: v2.0.0
 * @Copy: 深圳市蓝凌软件股份有限公司
 */
public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    // example : 5, 4, 3, 1
    ListNode(int[] x) {
        if (x != null) {
            for (int i = 0; i < x.length - 1; i++) {
                if (i == 0) {
                    val = x[i];
                    next = new ListNode(x[i + 1]);
                } else {
                    next.next.val = x[i];
                    next.next.next = new ListNode(x[i + 1]);
                }
            }
        }
    }
}
