import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    //스택2
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String s = reader.readLine();
            if (s.charAt(0) == '1') {
                StringTokenizer tk = new StringTokenizer(s);
                tk.nextToken();
                stack.add(Integer.parseInt(tk.nextToken()));
            } else if (s.charAt(0) == '2') {
                if (stack.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(stack.pop());
                }
                sb.append("\n");
            } else if (s.charAt(0) == '3') {
                sb.append(stack.size()).append("\n");
            } else if (s.charAt(0) == '4') {
                if (stack.isEmpty()) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append("\n");
            } else {
                if (stack.isEmpty()) {
                    sb.append(-1);
                } else {
                    sb.append(stack.peek());
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);

    }
}
