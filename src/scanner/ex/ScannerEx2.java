package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        System.out.println(num % 2 == 0 ? "짝수" : "홀수");
    }
}
