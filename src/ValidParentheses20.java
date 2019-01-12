import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: nautilis
 **/
public class ValidParentheses20 {
    public boolean isValid(String s) {
        if (s.equals("")) return true;
        Map<String, String> map = new HashMap<>();
        map.put("{", "}");
        map.put("[", "]");
        map.put("(", ")");
        String[] list = s.split("");
        Stack<String> stack = new Stack<String>();
        for (int i = list.length - 1; i >= 0; i--) {
            if (list[i].equals("}") || list[i].equals("]") || list[i].equals(")")) {
                stack.push(list[i]);
            } else {
                if (stack.isEmpty()) return false;
                String c = stack.pop();
                if (!c.equals(map.get(list[i]))) {
                    return false;
                }
            }

        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String c = "()";
        ValidParentheses20 test = new ValidParentheses20();
        System.out.println(test.isValid(c));
    }


}
