/**
 * @Description: <搜索旋转排序数组>
 * @Author: iByte
 * @Date: 2019-08-05 14:41
 * @Version: v2.0.0
 */
public class LeetCode33 {

    // 中间元素和右边界比较

    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return -1;
        }
        int left = 0;
        int right = len - 1;
        // 注意：这里是等于
        while (left < right) {
            int mid = (left + right) >>> 1;

            if (nums[mid] > nums[right]) {
                // 前有序，包括中间数
                // 6 7 8 9 1 2
                if (nums[left] <= target && target <= nums[mid]) {
                    // 基数对
                    right = mid;
                } else {
                    // 偶数对
                    left = mid + 1;
                }
            } else {
                // 后有序，包括中间数
                // 6 7 1 2 3 4 5 6
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
     * 如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     *
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (nums[len - 1] < target) {
            return len;
        }
        int left = 0;
        int right = len - 1;

        while (left <= right) {
            int mid = (left + right) >>> 1;
            // 等于的情况最简单，我们应该放在第 1 个分支进行判断
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                // 题目要我们返回大于或者等于目标值的第 1 个数的索引
                // 此时 mid 一定不是所求的左边界，
                // 此时左边界更新为 mid + 1
                left = mid + 1;
            } else {
                // 既然不会等于，此时 nums[mid] > target
                // mid 也一定不是所求的右边界
                // 此时右边界更新为 mid - 1
                right = mid - 1;
            }
        }
        return  left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{6, 7, 8, 9, 1, 2};
        int target = 5;
        System.out.println(new LeetCode81().search1(nums, target));
        System.out.println(7 >>> 1);
    }
}
