package fc.java.part2;

public class BinaryTest {
    public static void main(String[] args) {
        int a=10;
        float f=25.6f;
        boolean b=false;
        char c='A';
        String s="String";

        // 69를 10진수, 2진수,8진수,16진수로 출력하시요?(fc.java.part2.part2.BinaryTest 클래스)
        int decimal = 69;
        System.out.println("decimal = " + decimal);

        int binary = 0b01000101;
        System.out.println("binary = " + binary);

        int octal = 0105;
        System.out.println("octal = " + octal);

        int hex = 0x45;
        System.out.println("hex = " + hex);
    }
}
