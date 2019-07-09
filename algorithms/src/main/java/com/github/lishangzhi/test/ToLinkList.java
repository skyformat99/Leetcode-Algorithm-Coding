package com.github.lishangzhi.test;

/**
 * @Author: lishangzhi
 * @Date: 2019/7/3
 * @Description: <>
 * @Version: v2.0.0
 * @Copy: 深圳市蓝凌软件股份有限公司
 */
public class ToLinkList {

    public static void main(String[] args) {
        ToLinkList test2 = new ToLinkList();
        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(2);
        l1.next.next.next = new ListNode(3);
        l1.next.next.next.next = new ListNode(4);

        test2.printArrays(test2.listNodeToArray(l1));
    }

    //输出数组
    public void printArrays(int[] ints) {
        for (int x : ints) {
            System.out.print(x + " ");
        }
    }

    //将链表转换成数组
    public int[] listNodeToArray(ListNode l) {
        int size = listNodeSize(l);
        int[] ints = new int[size];
        int index = 0;
        while (l != null) {
            ints[index] = l.val;
            l = l.next;
            index++;
        }
        return ints;
    }

    //求链表的长度
    public int listNodeSize(ListNode l) {
        int size = 0;
        while (l != null) {
            size++;
            l = l.next;
        }
        return size;
    }

    //遍历一个链表
    public void printListNode(ListNode l) {
        while (l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }
    }
}
