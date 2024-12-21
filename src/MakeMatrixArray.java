public class MakeMatrixArray {
    public static void main(String[] args) {
        // Movie 배열 생성
        Movie[] m = new Movie[3];

        // 배열 각 요소를 초기화
        for (int i = 0; i < m.length; i++) {
            m[i] = new Movie();
        }

        // 첫 번째 Movie 객체의 속성 설정
        m[0].title = "A영화";
        m[0].major = "Jay";
        m[0].rating = 5;
        m[0].time = 90;

        // 정보 출력
        System.out.println(m[0].title);
        System.out.println(m[0].major);
        System.out.println(m[0].rating);
        System.out.println(m[0].time);
    }
}