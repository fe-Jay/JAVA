package casting;

public class Casting2 {
    // 1. 같은 타입끼리의 계산은 같은 타입의 결과를 낸다.
    // `int` + `int` 는 `int` 를, `double` + `double` 은 `double` 의 결과가 나온다.

    // 2.서로 다른 타입의 계산은 큰 범위로 자동 형변환이 일어난다.
    // `int` + `long` 은 `long` + `long` 으로 자동 형변환이 일어난다.
    // `int` + `double` 은 `double` + `double` 로 자동 형변환이 일어난다.
    public static void main(String[] args) {
        int div1 = 3 / 2;
        System.out.println("div1: " + div1); // 1

        double div2 = 3 / 2;
        System.out.println("div2: " + div2); // 1.0

        double div3 = 3.0 / 2;
        System.out.println("div3: " + div3); // 1.5

        double div4 = (double) 3 / 2;
        System.out.println("div4: " + div4); // 1.5

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result: " + result); // 1.5
    }
}
