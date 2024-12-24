package fc.java.part2;

public class APIOverloading {
    public static void main(String[] args) {
        System.out.println(10);

        int max = maxValue(6, 60);
        System.out.println("max = " + max);
        
        int min = minValue(5, 50);
        System.out.println("min = " + min);
    }

    public static int maxValue(int a, int b) {
        int i = (a > b) ? a : b;
        return i;
    }

    public static int minValue(int a, int b) {
        int i = (a<b) ? a : b;
        return i;
    }

}
