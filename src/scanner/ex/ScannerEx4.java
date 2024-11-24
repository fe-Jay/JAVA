package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번재 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println("두 번재 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("두 숫자 사이의 모든 정수는? ");
        for(int i = num1; i<= num2; i++) {
            System.out.print(i);
            if( i != num2 ) {
                System.out.print(",");
            }
        }
    }
}
