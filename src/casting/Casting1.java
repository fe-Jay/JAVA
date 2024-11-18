package casting;

public class Casting1 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // 이것을 형(타입)을 바꾼다고 해서 형변환이라 한다. 영어로는 캐스팅이라 한다.
        // 개발자가 직접 형변환 코드를 입력한다고 해서 명시적 형변환이라 한다.
        intValue = (int) doubleValue;

        System.out.println((int) 10.5);


        // 보통 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다.
        // 참고로 `-2147483648` 숫자는 `int` 의 가장 작은 숫자이다.
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 최고값 + 1(초과)

        int intOverValue = 0;

        intOverValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting=" + intOverValue); //출력:2147483647
        intOverValue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting=" + intOverValue); //출력:-2147483648
     }
}
