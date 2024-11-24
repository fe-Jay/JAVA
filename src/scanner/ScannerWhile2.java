package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("첫번째 숫자 입력: ");
            int num1 = scanner.nextInt();

            System.out.println("두번째 숫자 입력: ");
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 == 0) {
                System.out.println("break!");
                break;
            }

            System.out.println("두 수의 합은: " + (num1 + num2));
        }
    }
}
