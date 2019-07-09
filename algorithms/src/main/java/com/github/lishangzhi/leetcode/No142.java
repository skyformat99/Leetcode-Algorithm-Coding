package com.github.lishangzhi.leetcode;

import com.github.lishangzhi.test.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/3
 * @Description: <>
 * @Version: v2.0.0
 * @Copy: 深圳市蓝凌软件股份有限公司
 */
public class No142 {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> visited = new HashSet<ListNode>();

        ListNode node = head;
        while (node != null) {
            if (visited.contains(node)) {
                return node;
            }
            visited.add(node);
//            node = node.next;
        }

        return null;
    }
}
