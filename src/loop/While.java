package loop;

public class While {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(sum < 10) {
            System.out.println(sum += i);
            i++;
        }
    }
}
