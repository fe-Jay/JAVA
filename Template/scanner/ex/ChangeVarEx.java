package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp; //a의 값 10

        //시작: 코드를 작성하세요
        temp = a; //10
        a = b;
        b = temp;
        //종료: 코드를 작성하세요

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}