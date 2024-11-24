package scanner;
import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번재 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.println("두 번재 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if(num1 > num2) {
            System.out.println("더 큰 숫자는 " + num1);
        } else if (num2 > num1) {
            System.out.println("더 큰 숫자는 " + num2);
        } else {
            System.out.println("두 숫자가 같습니다.");
        }
    }

}
