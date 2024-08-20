import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tk.nextToken());
        int m = Integer.parseInt(tk.nextToken());
        System.out.println((n + m) * (n - m));
    }
}