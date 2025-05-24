import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    //백설공주와 일곱 난쟁이
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] values = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += values[i] = Integer.parseInt(reader.readLine());
        }
        int notValuesSum = sum - 100;
        Set<Integer> set = new HashSet<>();
        boolean out = false;
        for (int i = 0; i < 9; i++) {
            if (notValuesSum > values[i]) {
                for (int j = 0; j < 9; j++) {
                    if (i != j && notValuesSum == values[i] + values[j]) {
                        set.add(i);
                        set.add(j);
                        out = true;
                        break;
                    }
                }
            }
            if (out) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (!set.contains(i)) {
                sb.append(values[i]).append("\n");
            }
        }
        System.out.println(sb);
    }
}