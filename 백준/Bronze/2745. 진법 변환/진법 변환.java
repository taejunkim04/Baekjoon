import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        String s = tk.nextToken();
        int num = Integer.parseInt(tk.nextToken());
        int locationValue = 1;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if ((int) c <= 64) {
                sum += locationValue * ((int) c - 48);
            } else {
                sum += locationValue * ((int) c - 55);
            }
            locationValue *= num;
        }
        System.out.println(sum);
    }
}