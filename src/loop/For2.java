package loop;

public class For2 {
    public static void main(String[] args) {
        //for문을 사용해서 다음 문제를 풀어보자.
        //**문제: 1부터 시작하여 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?**
        int sum = 0;
        int i = 1;

        for(; ; ) { // for (; ; )처럼 조건이 없으면 무한 반복한다.
            sum += i;
            if( sum > 10) {
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
            }
            i++;
        }
    }
}
