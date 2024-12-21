import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num=scanner.nextInt();
        System.out.println("num = " + num);

        System.out.println("실수를 입력하세요");
        float f = scanner.nextFloat();
        System.out.println("f = " + f);

        System.out.println("문자를 입력하세요.");
        String str = scanner.next();
        System.out.println("str = " + str);
    }
}
