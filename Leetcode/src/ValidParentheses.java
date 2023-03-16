import java.util.EmptyStackException;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        System.out.println(solution(")"));

    }

    public static boolean solution(String s) {

        boolean error = false;
        Stack<Character> bktStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char bkt = s.charAt(i);

            if (bkt == '(' || bkt == '{' || bkt == '[') {
                bktStack.push(bkt);
            } else {

                if (bktStack.empty()) {
                    error = true;
                    break;
                }

                char bktLast = bktStack.peek();
                if (!isSameType(bktLast, bkt)) {
                    error = true;
                    break;
                } else {
                    bktStack.pop();
                }
            }
        }

        if (error == true || !bktStack.empty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isSameType(char bkt1, char bkt2) {

        if (bkt1 == '(' && bkt2 == ')' ||
                bkt1 == '{' && bkt2 == '}' ||
                bkt1 == '[' && bkt2 == ']') {
            return true;
        } else {
            return false;
        }

    }
}
