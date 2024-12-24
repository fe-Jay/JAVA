package fc.java.part2;

public class CastingTest {
    public static void main(String[] args) {
        float f1=.10f;
        System.out.println("f1 = " + f1); // 0.1
        
        float f2=15f;
        System.out.println("f2 = " + f2); // 15.0
        
        float f3=3.14f;
        System.out.println("f3 = " + f3);
        
        double d1 = 123.4567;
        System.out.println("d1 = " + d1);

        float x = 15.6f;
        int y = (int)x; // 강제 형변환(손실)
        System.out.println("y = " + y); // 15
        
        char c = 'A';
        int cc = c;
        System.out.println("cc = " + cc); // 65

        int dd = 5;
        double ddd = dd; // 5.0
        System.out.println("ddd = " + ddd);

        double dx = 13.57;
        int dy = (int)dx; // 강제 형변환(손실)
        System.out.println("dy = " + dy); // 13
    }
}
