import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int result;
        result = a * (a - 1);
        System.out.println(result);
    }
}