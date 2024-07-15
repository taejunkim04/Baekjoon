import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            StringTokenizer tk = new StringTokenizer(reader.readLine());
            int num = Integer.parseInt(tk.nextToken());
            String s = tk.nextToken();
            for (int j = 0; j < s.length(); j++) {
                char temp = s.charAt(j);
                for (int x = 0; x < num; x++) {
                    sb.append(temp);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}