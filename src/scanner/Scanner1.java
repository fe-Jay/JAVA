package scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 사용자의 입력을 편리하게 받도록 도와준다고 이해하면 됨.

        // Input String
        System.out.print("문자열 입력: ");
        String str = scanner.nextLine(); // 사용자의 입력을 String으로 가져옴.

        System.out.println("입력 문자열: " + str);


        // Input int
        System.out.print("정수 입력: ");

        int intValue = scanner.nextInt();
        System.out.println("입력 정수: " + intValue);
    }
}
