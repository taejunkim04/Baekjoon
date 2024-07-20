import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] numbers;
    public static int n,m;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());

        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        
        numbers = new int[m];
        n_m(1, 0);
        System.out.println(sb);
    }

    public static void n_m(int start, int depth) {
        if (depth == m) {
            for (int number : numbers) {
                sb.append(number).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i <= n; i++) {
            numbers[depth] = i;
            n_m(i + 1, depth + 1);
        }
    }
}