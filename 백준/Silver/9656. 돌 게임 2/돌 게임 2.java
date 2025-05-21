import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //돌게임 2
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        if (num % 4 == 0) {
            System.out.println("SK");
        } else {
            if (num % 4 == 2) {
                System.out.println("SK");
            } else {
                System.out.println("CY");
            } 
        } 
    }
}