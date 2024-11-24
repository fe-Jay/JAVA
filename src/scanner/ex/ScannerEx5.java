package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        int input = 0;
        int i = 0;
        int sum = 0;

//        while(true) {
//            input = scanner.nextInt();
//
//            if(input == -1) {
//                break;
//            }
//
//            ++i;
//            sum += input;
//        }

        while((input = scanner.nextInt()) != -1) {
            sum += input;
            ++i;
        }

        System.out.println("입력한 숫자들의 합계는: " + sum);
        System.out.println("입력한 숫자들의 평균은: " + (sum / i));
    }
}
