package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("음식 이름을 입력하세요: ");
        String food = scanner.nextLine();

        System.out.println("음식의 가격을 입력하세요: ");
        int price = scanner.nextInt();

        System.out.println("음식의 수량을 입력하세요: ");
        int quantity = scanner.nextInt();

        System.out.println((food + quantity) + "개를 주문하셔서 금액은" + (price * quantity) + "입니다.");
    }
}
