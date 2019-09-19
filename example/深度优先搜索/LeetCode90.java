/**
 * @Author: lishangzhi
 * @Date: 2019/7/9
 * @Description: <验证二叉搜索树>
 * @link https://leetcode-cn.com/problems/validate-binary-search-tree/
 */
public class LeetCode90 {

    long pre = Long.MIN_VALUE;

    /**
     * 验证二叉树
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        // 验证左边树
        if (isValidBST(root.left)) {
            if (pre < root.val) {
                pre = root.val;

                //验证右边树
                return isValidBST(root.right);
            }
        }
        return false;
    }

    /**
     * 测试案例
     *
     * @param args
     */
    public static void main(String[] args) {
        LeetCode90 leetCode = new LeetCode90();

        // 模拟二叉树数据
        TreeNode treeNode = new TreeNode(2);
        treeNode.right = new TreeNode(1);
        treeNode.left = new TreeNode(3);

//        TreeNode treeNode = new TreeNode(5);
//        treeNode.right = new TreeNode(1);
//        treeNode.left = new TreeNode(4);
//
//        treeNode.right.left = new TreeNode(3);
//        treeNode.right.right = new TreeNode(6);


        System.out.println(leetCode.isValidBST(treeNode));
    }


}
