package loop;

public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(i < 10) {
            sum += i;
            if(sum > 10) {
                System.out.println("i: " + i + "sum: " + sum);
                break;
            }
            i++;
        }
    }
}
