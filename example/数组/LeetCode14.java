/**
 * @Description: <>
 * @Author: lishangzhi
 */
public class LeetCode14 {

    /**
     * 水平扫描
     *
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        //第一个集合数据【前缀】
        String prefix = strs[0];

        //int = 1 第二个数组开始比较
        for (int i = 1; i < strs.length; i++) {
            //判断是不是第一个出现
            while (strs[i].indexOf(prefix) != 0) {

                // 确定新的前缀字符串
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            if (prefix.isEmpty()) return "";
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(new LeetCode14().longestCommonPrefix(strs));
        //System.out.println("aaaacddd".indexOf("dd"));
    }
}
