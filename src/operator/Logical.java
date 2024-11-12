package operator;

public class Logical {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println(true && true); //true
        System.out.println(true && false);//false
        System.out.println(false && false);//false

        System.out.println("||: OR 연산");
        System.out.println(true || true); //true
        System.out.println(true || false);//true
        System.out.println(false || false);//false

        System.out.println("! 연산");
        System.out.println(!true); //false
        System.out.println(!false); //true

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false
        System.out.println(!b); // true
    }

//    int a = 15;
//    boolean result = 10 < a && a < 20;
//    System.out.println("result = " + result);
}
