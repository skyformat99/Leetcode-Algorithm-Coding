import com.sun.xml.internal.ws.util.StringUtils;

import java.util.HashMap;
import java.util.Stack;

/**
 * @Description: <>
 * @Author: lishangzhi
 */
public class LeetCode20 {

    //Hash存储配对
    private HashMap<Character, Character> mappings;


    public LeetCode20() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {

        //初始化stack
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //判断是否匹配,不存在则push进入到栈中，否则pop取出栈
            if (this.mappings.containsKey(c)) {

                //对称机制取出最顶上元素
                char topElement = stack.empty() ? '#' : stack.pop();

                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                //push 到栈中
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(new LeetCode20().isValid("{{}}[({})]"));
    }
}
