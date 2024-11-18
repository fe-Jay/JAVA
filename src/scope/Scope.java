package scope;

public class Scope {
    public static void main(String[] args) {
        // 변수는 꼭 필요한 범위로 한정해서 사용하는 것이 좋다. 변수의 스코프는 꼭 필요한 곳으로 한정해서 사용하자.
        // 메모리를 효율적으로 사용하고 더 유지보수하기 좋은 코드를 만들 수 있다.
        // 좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.
        int m = 10;
        if(true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }
        // x 는 scope를 벗어남.
        // System.out.println("if x = " + x);
    }
}
