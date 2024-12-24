package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        // Q. ‘가’라는 한글 한 문자를 변수에 저장하고 출력하시요.
        char c ='A';
        System.out.println("C= " + c); // A

        int a = 'A';
        System.out.println("a = " + a) ; // 65

        int b = 'B' + 1;
        System.out.println("b = " + (char)b); // C

        char han = '가';
        System.out.println("han = " + han);
        
        int hanD ='가';
        System.out.println("hanD = " + hanD);
        
        int hanU ='\uAC00';
        System.out.println("hanU = " + (char)hanU);


        // Q. 대문자 ‘A’를 문자 ‘a’로 변환하여 출력하시요.(ASCII코드 참고)
        char upper ='A';
        char lower = (char)(upper + 32);
        System.out.println("lower = " + lower); // 'a'

        char lower1 = 'u'; // 117
        int upper1 = lower1 - 32; // 117 - 32 = (85)
        System.out.println("upper1 = " + (char)upper1); // 'U'
        
        // Q. ‘1’+’2’=3이 나오도록 프로그래밍 하시요.
        int data = '1' + '2';
        System.out.println("data = " + data);
        
        char i = '1'-'0';
        char j = '2'-'0';
        int sum = i+j;
        System.out.println("sum = " + sum);
    }
}
