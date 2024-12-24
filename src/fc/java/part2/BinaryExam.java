package fc.java.part2;

public class BinaryExam {
    public static void main(String[] args) {
        // 123을 10진수, 2진수,8진수,16진수로 출력하시오
        int data = 123;
        String binary = Integer.toBinaryString(data);
        System.out.println("binary = " + binary);

        String octal = Integer.toOctalString(data);
        System.out.println("octal = " + octal);

        String hex = Integer.toHexString(data);
        System.out.println("hex = " + hex);
    }
}
