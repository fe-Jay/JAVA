package cond;

public class If2 {
    public static void main(String[] args) {
        int price = 9000;
        int age = 10;
        int discount = 0;

        if(price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000월 이상 구매, 1000원 할인");
        } else if(age <= 10) {
            discount = discount + 2000;
            System.out.println("어린이, 2000원 할인");
        } else System.out.println("할인 없음");

        System.out.println("총 할인 금액" + discount + "원");
    }
}
