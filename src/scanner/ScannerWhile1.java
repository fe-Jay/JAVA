package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("문자 입력(exit: 끝): ");
            String str = scanner.nextLine();

            if(str.equals("끝")) {
                System.out.println("끝!!!!!!");
                break;
            }

            System.out.println("입력 문자열"+ str);
        }
    }
}
