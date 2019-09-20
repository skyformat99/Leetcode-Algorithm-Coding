/**
 * @Description: <搜索旋转排序数组 II>
 * @Author: iByte
 * @Date: 2019-08-05 13:51
 * @Version: v2.0.0
 */
public class LeetCode81 {

    public boolean search1(int[] nums, int target) {
        int index = 0;
        if (nums.length == 1 && nums[0] != target) return false;
        // 注: 已经排序的数组
        // 数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2]
        // 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
        for (int i = 0; i < nums.length; i++) {
            //找到相等的下标值
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] nums = new int[]{1, 2, 3, 4, 5};
//        int target = 5;
//        System.out.println(new LeetCode81().search1(nums, target));
        System.out.println(4>>1);
    }

}
